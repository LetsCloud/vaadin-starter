package io.crs.vaadin.ui.components;

import static com.vaadin.flow.component.button.ButtonVariant.LUMO_ICON;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import io.crs.vaadin.ui.layout.size.Left;
import io.crs.vaadin.ui.layout.size.Right;
import io.crs.vaadin.ui.util.FontSize;
import io.crs.vaadin.ui.util.LumoStyles;
import io.crs.vaadin.ui.util.TextColor;
import io.crs.vaadin.ui.util.UIUtils;
import io.crs.vaadin.ui.util.css.BorderRadius;
import io.crs.vaadin.ui.util.css.Display;

public class Token extends Composite<FlexBoxLayout> implements HasStyle {

    private final String CLASS_NAME = "token";

    public Token(String text) {
        addClassName(CLASS_NAME);
        getContent().setAlignItems(FlexComponent.Alignment.CENTER);
        getContent().setBackgroundColor(LumoStyles.Color.Primary._10);
        getContent().setBorderRadius(BorderRadius.M);
        getContent().setDisplay(Display.INLINE_FLEX);
        getContent().setPadding(Left.S);
        getContent().setPadding(Right.XS);
        getContent().setSpacing(Right.XS);

        Label label = UIUtils.createLabel(FontSize.S, TextColor.BODY, text);
        Button button = UIUtils.createButton(VaadinIcon.CLOSE_SMALL,
                ButtonVariant.LUMO_SMALL, ButtonVariant.LUMO_TERTIARY_INLINE);
        button.getThemeNames().remove(LUMO_ICON.getVariantName());

        getContent().add(label, button);
    }

}
