package prac2_Backup;

public class Backup {
	
		public void BackupDB(String path)
		{ String executeCmd = "C:/xampp/mysql/bin/mysqldump -u root -psa -B studentdb>" + path;
		System.out.println(executeCmd);
		Process runtimeProcess;
		try {
			runtimeProcess = Runtime.getRuntime().exec(new String[] 
			{ "cmd.exe", "/c", executeCmd });
			int processComplete = runtimeProcess.waitFor();
			System.out.println(processComplete);
			if(processComplete== 0)
			{System.out.println("Backup Created Successfully !"); 
			}
			else
			{System.out.println("Couldn't Create the backup !");
			}
			}
		catch(Exception ex)
		{ex.printStackTrace(); } }
		public static void main(String[]args)
		{
			new Backup().BackupDB("C:/db.sql");
			}
		}


