package com.uniyaz;

import com.uniyaz.core.domain.Anket;
import com.uniyaz.core.domain.Kullanici;
import com.uniyaz.core.domain.Soru;
import com.uniyaz.uı.component.layout.ContentComponent;
import com.uniyaz.uı.component.layout.HbMenuBar;
import com.uniyaz.uı.component.layout.HeaderLayout;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
@Widgetset("com.uniyaz.MyAppWidgetset")
public class HbUI extends UI {

    private VerticalLayout mainLayout;
    private ContentComponent contentComponent;
    private Anket anket;
    private Soru soru;
    private Kullanici kullanici;

    @Override
    protected void init(VaadinRequest vaadinRequest)
    {
        buildMainLayout();
        setContent(mainLayout);
    }

    private void buildMainLayout()
    {
        mainLayout = new VerticalLayout();
        mainLayout.setSizeFull();

        contentComponent = new ContentComponent();

        HeaderLayout headerLayout = new HeaderLayout();
        mainLayout.addComponent(headerLayout);

       HbMenuBar hbMenuBar = new HbMenuBar();

        mainLayout.addComponent(hbMenuBar);
        mainLayout.addComponent(contentComponent);

        mainLayout.setExpandRatio(headerLayout, 0.8f);
        mainLayout.setExpandRatio(hbMenuBar, 0.6f);
        mainLayout.setExpandRatio(contentComponent, 8.6f);
    }

    public ContentComponent getContentComponent() {
        return contentComponent;
    }

    public void setContentComponent(ContentComponent contentComponent) {

        this.contentComponent = contentComponent;
    }

    public Anket getAnket() {
        return anket;
    }

    public void setAnket(Anket anket) {
        this.anket = anket;
    }

    public Soru getSoru() {
        return soru;
    }

    public void setSoru(Soru soru) {
        this.soru = soru;
    }

    public Kullanici getKullanici() {
        return kullanici;
    }

    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }
}
