package com.example.umeed.Adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.umeed.Activity.DoctorInfo;
import com.example.umeed.Activity.HospitalInfo;
import com.example.umeed.Activity.MapActivity;
import com.example.umeed.Models.AllListDataModel;
import com.example.umeed.databinding.LayoutDoctorListBinding;

import java.util.ArrayList;

public class DoctorListAdapter extends RecyclerView.Adapter<DoctorListAdapter.ViewHolder>{


    ArrayList<AllListDataModel> list;

    public DoctorListAdapter(ArrayList<AllListDataModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public DoctorListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutDoctorListBinding view = LayoutDoctorListBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DoctorListAdapter.ViewHolder holder, int position) {
        AllListDataModel model = list.get(position);
        holder.binding.nameDoctor.setText(model.getOwnername());
        holder.binding.phoneHospital.setText(model.getMobileno());
        holder.binding.addressHospital.setText(model.getAddress());
        holder.binding.kmHospital.setText(model.getDistance());
        holder.binding.typeHospital.setText(model.getType());

        String organizationname = model.getOrganizationname();
        String ownername = model.getOwnername();
        String medicalusertype = model.getMedicalusertype();
        String emailid = model.getEmailid();
        String website = model.getWebsite();
        String mobileno = model.getMobileno();
        String landlineno = model.getLandlineno();
        String medicalid = model.getMedicalid();
        String address = model.getAddress();
        String lattitude = model.getLattitude();
        String longitude = model.getLongitude();
        String specialization = model.getSpecialization();
        String covidpatientaccepted = model.getCovidpatientaccepted();
        String ayushmancardaccepted = model.getAyushmancardaccepted();
        String mediclaimaccepted = model.getMediclaimaccepted();
        String emergencypatientaccepted = model.getEmergencypatientaccepted();
        String info = model.getInfo();
        String type = model.getType();
        String bloodbank = model.getBloodbank();
        String distance = model.getDistance();

        holder.binding.detailsDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.binding.getRoot().getContext(), DoctorInfo.class);

                intent.putExtra("organizationname",organizationname);
                intent.putExtra("ownername",ownername);
                intent.putExtra("medicalusertype",medicalusertype);
                intent.putExtra("emailid",emailid);
                intent.putExtra("website",website);
                intent.putExtra("mobileno",mobileno);
                intent.putExtra("landlineno",landlineno);
                intent.putExtra("medicalid",medicalid);
                intent.putExtra("address",address);
                intent.putExtra("lattitude",lattitude);
                intent.putExtra("longitude",longitude);
                intent.putExtra("specialization",specialization);
                intent.putExtra("covidpatientaccepted",covidpatientaccepted);
                intent.putExtra("ayushmancardaccepted",ayushmancardaccepted);
                intent.putExtra("mediclaimaccepted",mediclaimaccepted);
                intent.putExtra("emergencypatientaccepted",emergencypatientaccepted);
                intent.putExtra("info",info);
                intent.putExtra("type",type);
                intent.putExtra("bloodbank",bloodbank);
                intent.putExtra("distance",distance);

                holder.binding.getRoot().getContext().startActivity(intent);
            }
        });

        holder.binding.mapHospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(holder.binding.getRoot().getContext(), MapActivity.class);
                intent.putExtra("lattitude",lattitude);
                intent.putExtra("longitude",longitude);
                holder.binding.getRoot().getContext().startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        LayoutDoctorListBinding binding;

        public ViewHolder(@NonNull LayoutDoctorListBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
