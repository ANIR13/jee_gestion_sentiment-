package com.actions;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import com.bo.Internaute;
import com.services.GsInternauteService;
@ResultPath("/pages/")
public class GsInternauteAction extends BaseAction implements SessionAware{
private Internaute internaute;
private List<Internaute> listInternautes;

private Map<String, Object> session;
@Autowired
private GsInternauteService gsInternauteService;
@Action(value = "redirect", results = { @Result(name = "success",location = "destination.jsp") })
public String redirect(){
	return SUCCESS ; 
}

@Action(value = "addInternaute", results = { @Result(name = "success", location = "afficherInternaute.jsp") ,
		@Result(name = "input", location = "formulaire.jsp")		
})
public String addInternaute() {
	// On utilise le service métier pour sauvegarder en base de données le
	// produit
	// rempli par les données copiées automatiquement par struts de la vue
	// vers
	// l'objet produit
	gsInternauteService.addInternaute(internaute);
	// On retoune la page associée à success
	return SUCCESS;

}

@Action(value = "simuAuth", results = { @Result(name = "success", type="redirectAction", location = "getAllProducts") })
public String simuAuth() {
	Internaute client = gsInternauteService.getInternauteById(Long.valueOf(1));
	if (client != null) {
		session.put("client", gsInternauteService.getInternauteById(Long.valueOf(1)));
	}
	return SUCCESS;
}

@Action(value = "getAllInternaute", results = { @Result(name = "success", location = "listClients.jsp") })
public String getAllInternaute() {
	// En utiliant le service métier on charge la liste des produit et on la
	// stocke
	// dans l'attribut qui sera lu depuis une vue
	listInternautes = gsInternauteService.getAllInternautes();
	// on redirige vers la vue associé à la clé sucess
	return SUCCESS;
}

@Action(value = "gettInternaute", results = { @Result(name = "success", location = "afficherInternaute.jsp") })
public String gettInternaute() {
	// En utiliant le service métier on charge la liste des produit et on la
	// stocke
	// dans l'attribut qui sera lu depuis une vue
	internaute = gsInternauteService.getInternauteById(2l);
	// on redirige vers la vue associé à la clé sucess
	return SUCCESS;
}

@Action(value = "comparaison", results = { @Result(name = "input", location = "formulaire.jsp") ,
 @Result(name = "success", location = "afficherInternaute.jsp") } )
public String comparaison(){
	
	listInternautes = gsInternauteService.getAllInternautes();
	ListIterator<Internaute> i = listInternautes.listIterator();
	while(i.hasNext()) {
		System.out.println("success");
//		System.out.println(this.getInternaute().getLogin());
//		System.out.println(i.next().getLogin());
    if(this.getInternaute().getLogin().equals(i.next().getLogin())){
	return SUCCESS; } 
     }
	System.out.println("input");
	//listInternautes = gsInternauteService.getAllInternautes();
   return INPUT;  
}
/*
@Action(value ="afficherInternaute",results={@Result(name="success",location="afficherInternaute.jsp")})
public String afficherInternaute(){
	Internaute x =new Internaute();
	x=gsInternauteService.getInternauteById(Long.valueOf(1));
	return SUCCESS;
}*/
@Override
	public void setSession(Map<String, Object> pSession) {
		session = pSession;		
}
public Internaute getInternaute() {
	return internaute;
}
public void setInternaute(Internaute internaute) {
	this.internaute = internaute;
}

public GsInternauteService getGsInternauteService() {
	return gsInternauteService;
}

public void setGsInternauteService(GsInternauteService gsInternauteService) {
	this.gsInternauteService = gsInternauteService;
}



}
