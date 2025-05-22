using System;
using System.Diagnostics;

class Program
{
    static void Main()
    {
        Console.WriteLine("Memulai rotasi layar otomatis...");
        int jumlahPutaran = 4;

        for (int i = 0; i < jumlahPutaran; i++)
        {
            RotateScreen();
        }

        Console.WriteLine("Rotasi selesai.");
    }

    static void RotateScreen()
    {
        try
        {
            Process.Start(new ProcessStartInfo
            {
                FileName = "cmd.exe",
                Arguments = "/c rundll32.exe user32.dll,SetDisplayConfig 0 0 0 0",
                CreateNoWindow = true,
                UseShellExecute = false
            });

            Console.WriteLine("Layar telah diputar.");
        }
        catch (Exception ex)
        {
            Console.WriteLine("Terjadi kesalahan: " + ex.Message);
        }
    }
}