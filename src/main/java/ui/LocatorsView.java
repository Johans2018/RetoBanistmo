package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * Clase que centraliza los localizadores (Targets) utilizados en las diferentes Tasks
 * de la automatización de la plataforma Banistmo.
 *
 * @author Jonathan Ballesteros
 * @version 1.0
 */
public class LocatorsView {

    public static final Target PRODUCTS_AND_SERVICES = Target.the("Products and services button")
            .located(By.xpath("//div[@id='navbar-collapse-grid']/child::ul/li[3]"));

    public static final Target PRIVACY_NOTICE = Target.the("Privacy notice")
            .located(By.xpath("//h3[contains(., 'Aviso de Privacidad')]"));

    public static final Target UNDERSTOOD_BUTTON = Target.the("Understood button")
            .located(By.xpath("//button[@id='btn-aceptar-cookies']"));

    public static final Target LOANS =Target.the("Loans").located(By
            .xpath("//a[@href='/wps/portal/banistmo/personas/productos-y-servicios/prestamos']"));

    public static final Target TITLE_BANISTMO = Target.the("Title Banistmo").located(By
            .xpath("//p[contains(., 'En Banistmo, entendemos que cada etapa de la vida')]"));

    public static final Target LOANS_AUTOS = Target.the("Loans autos").located(By
            .xpath("(//a[@href='/wps/portal/banistmo/personas/productos-y-servicios/prestamos/automoviles'])[2]"));

    public static final Target TITLE_LOANS = Target.the("Title loans").located(By
            .xpath("(//a[@href='/wps/portal/banistmo/personas/productos-y-servicios/prestamos/automoviles/automoviles-regulares'])[2]"));

    public static final Target RATES_AND_FEES =Target.the("Rates and fees").located(By
            .xpath("//a[@href='#tab4']"));

    public static final Target PDF_PROHIBITIONS =Target.the("PDF prohibitions").located(By
            .xpath("(//a[@href='/wps/wcm/connect/www.banistmo.com11237/7b900517-9baa-4eac-aa23-3adeb561600e/ProhibicionesSuperIntendenciaDeBancosSIB.pdf?MOD=AJPERES&CVID=lPXjRcF'])[1]"));
}
