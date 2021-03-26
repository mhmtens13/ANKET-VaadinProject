package com.uniyaz.uı.component.button;

import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Button;
import com.vaadin.ui.themes.ValoTheme;

public class HbSaveButton extends Button
{
    public HbSaveButton()
    {
        addStyleName("btnPrimary");
        setIcon(FontAwesome.SAVE);
        addStyleName(ValoTheme.BUTTON_PRIMARY);
    }
}
