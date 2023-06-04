package NetStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

//im static jdk.internal.net.http.common.Utils.close;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(9999);
        //监听连接
        Socket s=ss.accept();
        //获取输入流
        BufferedReader br =new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line;
        while((line=br.readLine())!=null)
        {
            System.out.println(line);
        }
        ss.close();

    }
}
