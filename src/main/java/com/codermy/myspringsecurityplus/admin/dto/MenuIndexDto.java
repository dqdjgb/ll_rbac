package com.codermy.myspringsecurityplus.admin.dto;

import java.io.Serializable;
import java.util.List;

public class MenuIndexDto implements Serializable {
    private Integer id;
    private Integer parentId;
    private String title;
    private String icon;
    private Integer type;
    private String href;
    private String permission;
    private List<MenuIndexDto> children;
}
