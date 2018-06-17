package org.launchcode.models.forms;

import org.launchcode.models.Cheese;
import org.launchcode.models.Menu;

import javax.validation.constraints.NotNull;

public class AddMenuItemForm {

    @NotNull
    private int menuId;
    private Menu menu;

    @NotNull
    private int cheeseId;
    private Iterable<Cheese> cheeses;

    public AddMenuItemForm() {}

    public AddMenuItemForm(Menu menu, Iterable<Cheese> cheeses) {
        this.menu = menu;
        this.cheeses = cheeses;
    }

    public int getMenuId() {
        return menuId;
    }

    public Menu getMenu() {
        return menu;
    }

    public int getCheeseId() {
        return cheeseId;
    }

    public Iterable<Cheese> getCheeses() {
        return cheeses;
    }
}
