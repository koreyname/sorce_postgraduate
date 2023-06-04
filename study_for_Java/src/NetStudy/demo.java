package NetStudy;

import java.io.*;
import java.net.Socket;

//TCP通信
public class demo {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("127.0.0.1",9999);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while((line=br.readLine())!=null) {
            if ("886".equals(line)) {
                break;
            } else
            {
                //获取输出流
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
        }
        s.close();
    }
}
