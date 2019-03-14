package com.example.demogiuaky;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.demogiuaky.Model.ContactModel;

import java.util.ArrayList;
import java.util.List;

public class ContactActivity extends AppCompatActivity {
    Button btnBack;
    ListView listview;
    TextView tvTenSP,tvMaSP,tvGia;

    ArrayList<ContactModel> modelList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        onInit();
        setOnData();
        CustumAdapter custumAdapter = new CustumAdapter(ContactActivity.this,R.layout.row_item_contact,modelList);
        listview.setAdapter(custumAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                
            }
        });


    }

    private void setOnData() {
    modelList = new ArrayList<ContactModel>();
    modelList.add(new ContactModel("Mai Văn Minh Nhật",1606020072,"10THC","SamSungGalaxy S9","DDOC06","19.990.000"));
    modelList.add(new ContactModel("Mai Văn Minh Nhật",1606020072,"10THC","SamSungGalaxy S9+","OCCD06","21.990.000"));
    modelList.add(new ContactModel("Mai Văn Minh Nhật",1606020072,"10THC","SamSungGalaxy S10","SSS10","23.990.000"));
    modelList.add(new ContactModel("Mai Văn Minh Nhật",1606020072,"10THC","SamSungGalaxy S10+","SSS10P","25.990.000"));
    }

    private void onInit() {
        btnBack = (Button)findViewById(R.id.btnBack);
        listview = (ListView)findViewById(R.id.listview);
        tvTenSP =(TextView)findViewById(R.id.tvTenSP);
        tvMaSP =(TextView)findViewById(R.id.tvMaSP);
        tvGia =(TextView)findViewById(R.id.tvGia);
    }
    public class CustumAdapter extends ArrayAdapter<ContactModel>{
        private Context mContex;
        private int mResource;
        private List<ContactModel>mList;

        public CustumAdapter(Context context, int resource, List<ContactModel> objects) {
            super(context, resource, objects);
            this.mContex = context;
            this.mResource = resource;
            this.mList = objects;
        }


        @Override
        public View getView(int position,View convertView, ViewGroup parent) {
            viewHolder viewHolder = null;
            if (viewHolder==null){
                convertView = LayoutInflater.from(mContex).inflate(mResource,parent,false);
                viewHolder = new viewHolder();
                viewHolder.tvTenSP = convertView.findViewById(R.id.tvTenSP);
                viewHolder.tvMaSP = convertView.findViewById(R.id.tvMaSP);
                viewHolder.tvGia = convertView.findViewById(R.id.tvGia);
                convertView.setTag(viewHolder);
            }else {
                viewHolder = (viewHolder) convertView.getTag();
            }
            ContactModel contactModel =mList.get(position);
                viewHolder.tvTenSP.setText(String.valueOf(contactModel.getTenSP()));
                viewHolder.tvMaSP.setText(String.valueOf(contactModel.getMaSP()));
                viewHolder.tvGia.setText(String.valueOf(contactModel.getGia()));
            return convertView;
        }
    }
    public class viewHolder{
        TextView tvTenSP,tvMaSP,tvGia;
    }
}
