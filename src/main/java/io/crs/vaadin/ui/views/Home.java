package io.crs.vaadin.ui.views;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import io.crs.vaadin.ui.MainLayout;
import io.crs.vaadin.ui.components.FlexBoxLayout;
import io.crs.vaadin.ui.layout.size.Horizontal;
import io.crs.vaadin.ui.layout.size.Vertical;

@Route(value = "", layout = MainLayout.class)
@PageTitle("Welcome")
public class Home extends ViewFrame {

    public Home() {
        setId("home");
        setViewContent(createContent());
    }

    private Component createContent() {
        Html text = new Html(
                "<span>A responsive application template with some dummy data. Loosely based on the <b>responsive layout grid</b> guidelines set by <a href=\"https://material.io/design/layout/responsive-layout-grid.html\">Material Design</a>. Utilises the <a href=\"https://vaadin.com/themes/lumo\">Lumo</a> theme.</span>");

        FlexBoxLayout content = new FlexBoxLayout(text);
        content.setMargin(Horizontal.AUTO);
        content.setMaxWidth("840px");
        content.setPadding(Horizontal.RESPONSIVE_L, Vertical.L);
        return content;
    }

}
