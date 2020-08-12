package com.example.mypersonalapps;
/*Nama : Muhammad Aziduddin Haju
NIM  : 10117272
KELAS : AKB-IF8
Tanggal Pengerjaan :11 Agustus 2020*/
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class profil extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_profil, container, false);

        return view;
    }
}
