package hyywk.home;

import java.io.InputStream;

public class IPGet {
	private String call = "curl ifconfig.me";
	public String getIP() throws Exception {
		 InputStream inputStream =null;
		  try {
			  Process   process   =   Runtime.getRuntime().exec( this.call );
			  process.waitFor();
			  inputStream = process.getInputStream();
			  byte[] bs = new byte[ inputStream.available() ];
			  inputStream.read( bs );
			 
			  return new String( bs );
		  } catch (Exception e) {
			// TODO: handle exception
			throw  new Exception( "获取ip地址失败，请检查系统是否安装：curl 和  ifconfig 命令" );
		  }finally {
			  if ( inputStream!= null) {
				  inputStream.close();
			  }
		}
	}
}
