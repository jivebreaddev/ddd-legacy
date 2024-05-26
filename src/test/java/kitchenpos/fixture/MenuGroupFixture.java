package kitchenpos.fixture;

import kitchenpos.domain.MenuGroup;

public class MenuGroupFixture {
  public static MenuGroup createMenuGroup(final String name) {
    MenuGroup menuGroup = new MenuGroup();
    menuGroup.setName(name);
    return menuGroup;
  }
}
