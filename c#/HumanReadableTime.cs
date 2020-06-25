/*
Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)

HH = hours, padded to 2 digits, range: 00 - 99
MM = minutes, padded to 2 digits, range: 00 - 59
SS = seconds, padded to 2 digits, range: 00 - 59
The maximum time never exceeds 359999 (99:59:59)
*/
public static class TimeFormat
{
    public static string GetReadableTime(int seconds)
    {
       int hours = seconds/3600;
       int minutes = seconds%3600/60;
       seconds = seconds%3600%60;
       return hours.ToString("D2")+":"+minutes.ToString("D2")+":"+seconds.ToString("D2");
    }
}