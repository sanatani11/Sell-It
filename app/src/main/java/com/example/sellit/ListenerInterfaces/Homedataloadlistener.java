package com.example.sellit.ListenerInterfaces;

import com.example.sellit.data_classes.Property_model_class;

import java.util.List;

public interface Homedataloadlistener {
    void onHomedataloaded(List<Property_model_class> fullyloadeddata);
}
