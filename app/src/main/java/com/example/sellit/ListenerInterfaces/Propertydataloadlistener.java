package com.example.sellit.ListenerInterfaces;

import com.example.sellit.data_classes.Hetero_model_for_userprofile;

import java.util.List;

public interface Propertydataloadlistener {
    void onPropertydataloaded(List<Hetero_model_for_userprofile> fullyloadeddata);
}
