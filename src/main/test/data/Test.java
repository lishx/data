package data;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Test {
	public static void main(String[] args) throws IOException {
		URL u=new URL("http://route.showapi.com/44-6?showapi_appid=18455&showapi_sign=d706853b91934747bbcc4d0ece67c364");
        InputStream in=u.openStream();
        ByteArrayOutputStream out=new ByteArrayOutputStream();
        try {
            byte buf[]=new byte[1024];
            int read = 0;
            while ((read = in.read(buf)) > 0) {
                out.write(buf, 0, read);
            }
        }  finally {
            if (in != null) {
                in.close();
            }
        }
        byte b[]=out.toByteArray( );
        System.out.println(new String(b,"utf-8"));
	}
}
