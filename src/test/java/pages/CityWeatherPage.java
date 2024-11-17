package pages;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class CityWeatherPage extends Form {

    private final ILabel cityWeatherHeader = getElementFactory().getLabel(By.className("header-loc"), "City Weather Page Header");

    public CityWeatherPage() {
        super(By.className("header-loc"), "City Weather Page");
    }

    public String getCityNameFromHeader() {
        return cityWeatherHeader.getText();
    }
}
