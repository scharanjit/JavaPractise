package j2ee1001;

import java.io.* ;
import java.net.*;

public class Find
{
      public static void main (String[] args)
      {
           if ( args.length == 1 )
           {
                String domain = args[0];
                try
                {
                   InetAddress addr = InetAddress.getByName ( domain);
                   System.out.println ( "IP Address : " + addr.getHostAddress());
                   System.out.println() ;
                                   
               }
               catch ( UnknownHostException e )
               {
                    System.err.println ( "Can't detect domain " + args +" : " +e ) ;
                }
           }
     }
 }
