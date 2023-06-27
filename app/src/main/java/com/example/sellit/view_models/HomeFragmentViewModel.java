package com.example.sellit.view_models;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.sellit.ListenerInterfaces.Homedataloadlistener;
import com.example.sellit.data_classes.Property_model_class;
import com.example.sellit.Repository.HomeFragmentRepository;

import java.util.List;

public class HomeFragmentViewModel extends ViewModel implements Homedataloadlistener {

    private MutableLiveData<List<Property_model_class>> home_data_list_vm;
    private HomeFragmentRepository homeFragmentRepository;

    public LiveData<List<Property_model_class>> get_home_data_list_vm(){
        return home_data_list_vm;
    }

    public void initHomeFragmentViewModel() {
        if (home_data_list_vm == null) {
            homeFragmentRepository = HomeFragmentRepository.getInstance(this);
            home_data_list_vm = homeFragmentRepository.getHome_data_list_repo();
        }
    }

    @Override
    public void onHomedataloaded(List<Property_model_class> fullyloadeddata) {
        home_data_list_vm.setValue(fullyloadeddata);
    }
}
