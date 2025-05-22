import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.net.InetSocketAddress;

public class WebMonitor {

    public static void main(String[] args) throws Exception {
        // Menentukan port dan IP untuk server
        int port = 5500;
        String ip = "127.0.0.1";
        
        // Membuat server HTTP yang akan berjalan pada IP dan port tertentu
        HttpServer server = HttpServer.create(new InetSocketAddress(ip, port), 0);
        System.out.println("Server berjalan di http://" + ip + ":" + port);

        // Menambahkan handler untuk route yang memantau aktivitas
        server.createContext("/", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                try {
                    // Mendapatkan informasi pengguna
                    String clientIP = exchange.getRemoteAddress().getAddress().getHostAddress();
                    String requestMethod = exchange.getRequestMethod();  // GET, POST, dll.
                    String requestURI = exchange.getRequestURI().toString();  // URI yang diakses
                    String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());  // Waktu akses

                    // Menulis log aktivitas ke file
                    File logFile = new File("web_activity_log.txt");
                    try (BufferedWriter logWriter = new BufferedWriter(new FileWriter(logFile, true))) {
                        logWriter.write("Timestamp: " + timestamp + "\n");
                        logWriter.write("IP Pengguna: " + clientIP + "\n");
                        logWriter.write("Metode Permintaan: " + requestMethod + "\n");
                        logWriter.write("URI yang Diakses: " + requestURI + "\n");
                        logWriter.write("=====================================\n");
                        logWriter.flush();
                    } catch (IOException e) {
                        System.err.println("Kesalahan saat menulis ke file log: " + e.getMessage());
                    }

                    // Menanggapi permintaan dengan pesan sederhana
                    String response = "Permintaan diterima. Aktivitas tercatat!";
                    exchange.sendResponseHeaders(200, response.getBytes().length);
                    OutputStream os = exchange.getResponseBody();
                    os.write(response.getBytes());
                    os.close();

                } catch (IOException e) {
                    System.err.println("Kesalahan saat menangani permintaan: " + e.getMessage());
                    String errorResponse = "Terjadi kesalahan, coba lagi nanti!";
                    exchange.sendResponseHeaders(500, errorResponse.getBytes().length);
                    OutputStream os = exchange.getResponseBody();
                    os.write(errorResponse.getBytes());
                    os.close();
                }
            }
        });

        // Menjalankan server
        server.start();
    }
}
