//package com.simcroot.Adapter;
//
//import android.annotation.SuppressLint;
//import android.content.Intent;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.simcroot.EditActivity;
//import com.simcroot.Adapter.MahasiswaAdapter;
//import com.simcroot.Model.Mahasiswa;
//import com.simcroot.Model.GetMahasiswa;
//import com.simcroot.Model.R;
//
//import java.util.List;
//public class MahasiswaAdapter extends RecyclerView.Adapter<com.simcroot.Adapter.MahasiswaAdapter.MyViewHolder>{
//    List<GetMahasiswa> mMahasiswaList;
//
//    public MahasiswaAdapter(List<GetMahasiswa> MahasiswaList) {
//        mMahasiswaList = MahasiswaList;
//    }
//
//    @Override
//    public MahasiswaAdapter onCreateViewHolder (ViewGroup parent, int viewType){
//        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.mahasiswa_list, parent, false);
//        com.simcroot.Adapter.MahasiswaAdapter.MyViewHolder mViewHolder = new com.simcroot.Adapter.MahasiswaAdapter.MyViewHolder(mView);
//        return mViewHolder;
//    }
//
//    @Override
//    public void onBindViewHolder (com.pemrog.kontak.Adapter.KontakAdapter.MyViewHolder holder, @SuppressLint("RecyclerView") final int position){
//        holder.mTextViewId.setText("Id = " + mKontakList.get(position).getId());
//        holder.mTextViewNama.setText("Nama = " + mKontakList.get(position).getNama());
//        holder.mTextViewNomor.setText("Nomor = " + mKontakList.get(position).getNomor());
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent mIntent = new Intent(view.getContext(), EditActivity.class);
//                mIntent.putExtra("Id", mKontakList.get(position).getId());
//                mIntent.putExtra("Nama", mKontakList.get(position).getNama());
//                mIntent.putExtra("Nomor", mKontakList.get(position).getNomor());
//                view.getContext().startActivity(mIntent);
//            }
//        });
//    }
//
//    @Override
//    public int getItemCount () {
//        return mKontakList.size();
//    }
//
//    public class MyViewHolder extends RecyclerView.ViewHolder {
//        public TextView mTextViewId, mTextViewNama, mTextViewNomor;
//
//        public MyViewHolder(View itemView) {
//            super(itemView);
//            mTextViewId = (TextView) itemView.findViewById(R.id.tvId);
//            mTextViewNama = (TextView) itemView.findViewById(R.id.tvNama);
//            mTextViewNomor = (TextView) itemView.findViewById(R.id.tvNomor);
//        }
//    }
//}
