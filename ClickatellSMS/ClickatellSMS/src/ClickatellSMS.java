import java.io.IOException;
import java.util.Properties;

import org.marre.sms.SmsAddress;
import org.marre.sms.SmsException;
import org.marre.sms.SmsTextMessage;
import org.marre.sms.transport.SmsTransport;
import org.marre.sms.transport.SmsTransportManager;

public class ClickatellSMS {

 /**
 * @param args
 */
 public static void main(String[] args) {
  // The username, password and apiid is sent to the clickatell transport
  // in a Properties
  Properties props = new Properties();

  props.setProperty("smsj.clickatell.username", "clickvelegi");
  props.setProperty("smsj.clickatell.password", "Password123");
  props.setProperty("smsj.clickatell.apiid", "3624332");

  // Load the clickatell transport
  SmsTransport transport = null;
  try {
   transport = SmsTransportManager.getTransport(
     "org.marre.sms.transport.clickatell.ClickatellTransport",
     props);
  } catch (SmsException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }

  // Connect to clickatell
  try {
   transport.connect();
  } catch (SmsException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  } catch (IOException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }

  // Create the sms message
  SmsTextMessage textMessage = new SmsTextMessage(
    "Messaggio da Sabino");

  // Send the sms to "461234" from "461235"
  try {
   transport.send(textMessage, new SmsAddress("+393391389183"),new SmsAddress("+393391389183"));  // CC means the Country Code
   
   ClickatellHttp.Message response = click.
   System.out
     .println(" transport.send(textMessage, new SmsAddress('+393313873247'),new SmsAddress('+393313873247')));");
  } catch (SmsException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  } catch (IOException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }

  // Disconnect from clickatell
  try {
   transport.disconnect();

   System.out.println(" transport.disconnect();");
  } catch (SmsException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  } catch (IOException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
 }
}