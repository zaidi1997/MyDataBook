package sg.edu.rp.c346.mydatabook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DataAdapter extends ArrayAdapter<Data> {
    Context context;
    private ArrayList<Data> data;
    private TextView tvName;
    private ImageView ivIcon;

    public DataAdapter(Context context, int resource, ArrayList<Data> objects){
        super(context, resource, objects);
        data = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);

        tvName = rowView.findViewById(R.id.tvName);
        ivIcon = rowView.findViewById(R.id.ivIcon);


        Data currentData = data.get(position);

        if(currentData.getName().equals("Bio")) {
            tvName.setText("Bio");
            ivIcon.setImageResource(R.drawable.ic_bio);
        } else if(currentData.getName().equals("Vaccination")) {
            tvName.setText("Vaccination");
            ivIcon.setImageResource(R.drawable.ic_vacc);
        } else if(currentData.getName().equals("Anniversary")) {
            tvName.setText("Anniversary");
            ivIcon.setImageResource(R.drawable.ic_anni);
        } else if(currentData.getName().equals("About Us")) {
            tvName.setText("About Us");
            ivIcon.setImageResource(R.drawable.ic_about);
        }
        return rowView;
    }
}

