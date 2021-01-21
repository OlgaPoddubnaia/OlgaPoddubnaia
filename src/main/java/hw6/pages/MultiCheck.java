package hw6.pages;

import com.epam.jdi.light.elements.common.UIElement;
import com.epam.jdi.light.elements.complex.Checklist;

import java.util.List;

public class MultiCheck extends Checklist {

    @Override
    public void uncheckAll() {
        super.uncheckAll();
    }



    @Override
    public List<String> checked() {
        return super.checked();
    }

    @Override
    public void uncheck(String... names) {
        super.uncheck(names);
    }
}
