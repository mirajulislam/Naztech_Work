package valid;

import java.util.regex.Pattern;

public class Phone {
	
	private String phone;
	private String mail;
		
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

public String Check() {	
	if((phone.length()==11)&&(phone.startsWith("017")||phone.startsWith("019")||phone.startsWith("018")||phone.startsWith("016")||phone.startsWith("015"))) {
		
			return "valid";
				
}
	 return "not valid";
}


public String MailCheck() {
	
	String emailregex = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
	 Boolean b = mail.matches(emailregex);
	 if (b == true) {
        return "emailValid";
         }
	 return "notValid";
 }

	
}




