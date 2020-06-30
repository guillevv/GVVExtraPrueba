package ufv.dis.extraordinario.GVVExtraPrueba;

import java.util.Date;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;


/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of an HTML page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {

	Tweets tuit = new Tweets();
	Tweet tweet = new Tweet("Twitter", "Bienvenido", new Date());
	Date date = new Date();
	
//	TextField filatuit1 = new TextField();
//    TextField filatuit2 = new TextField();
//    TextField filatuit3 = new TextField();
	
    @Override
    protected void init(VaadinRequest vaadinRequest) {
        final VerticalLayout layout = new VerticalLayout();
        
        final TextField nombre = new TextField();
        nombre.setCaption("Nombre");
        final TextField t = new TextField();
        t.setCaption("¿Qué esta pasando?");
        
        

        Button button = new Button("Publicar tweet");
        
        button.addClickListener(e -> {
            
        	Tweet tweet = new Tweet(nombre.getValue(), t.getValue(), date);
            tuit.addTweet(tweet);
        
//			filatuit1.setValue(nombre.getValue());
//			filatuit2.setValue(t.getValue());
//			filatuit3.setValue(tweet.FechaHuman(date));
//			filatuit1.setReadOnly(true);
        });
        
       //No me ha dado tiempo a hacer el grid, pongo textfields para comprobar si coge bien los valores
        
        layout.addComponents(nombre, t, button); //filatuit1, filatuit2, filatuit3
        
        
        setContent(layout);
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
