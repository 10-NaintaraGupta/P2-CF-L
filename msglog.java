package prac5_my_logger;

import java.io.*;
import java.text.*;
import java.util.*;
public class msglog
{
	protected static String defaultLogFile="c:\\msglog.txt";
	public static void write(String s) throws IOException
	{
		write(defaultLogFile,s);
	}
	public static void write(String f,String s) throws IOException
	{
		TimeZone tz=TimeZone.getTimeZone("EST");//or PST,MID,etc..
		Date now=new Date();
		DateFormat df=new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
		df.setTimeZone(tz);
		String currentTime=df.format(now);
		FileWriter awriter=new FileWriter(f,true);
		awriter.write(currentTime+" "+s+"\n");
		awriter.flush();
		awriter.close();
	}
	public static void main(String args[]) throws Exception
	{
		write(args[0]);
	}
}