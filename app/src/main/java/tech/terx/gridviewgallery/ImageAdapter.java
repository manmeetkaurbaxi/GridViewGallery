package tech.terx.gridviewgallery;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by Microsoft on 03-Mar-18.
 */

public class ImageAdapter extends BaseAdapter {

    private Context mContext;
    int imageTotal = 7;

    public static String[] mThumbIds = {
            "https://scontent.fluh1-1.fna.fbcdn.net/v/t31.0-8/28515874_1630322350336511_4170774801081111472_o.jpg?oh=9e6bf4378e7c775a4c1df586e2da159a&oe=5B44F062",
            "https://scontent.fluh1-1.fna.fbcdn.net/v/t31.0-8/28515106_1630318663670213_6032804386743144568_o.jpg?oh=f200afde482a0f5fac3a4e6f64c5a89a&oe=5B00243A",
            "https://scontent.fluh1-1.fna.fbcdn.net/v/t31.0-8/28514572_1630315507003862_6813225947563909034_o.jpg?oh=0cb87469ccb2f6bc4788af9b7cf2b8f1&oe=5B0CFFB1",
            "https://scontent.fluh1-1.fna.fbcdn.net/v/t31.0-8/28514754_1629911447044268_2622057147840247968_o.jpg?oh=be268bd69c5197d257692b81624b37b8&oe=5B126B8D",
            "https://scontent.fluh1-1.fna.fbcdn.net/v/t31.0-8/28336965_1627905093911570_6201495703345139374_o.jpg?oh=b783c67e16f7653164e33d712554cb12&oe=5B46EB45",
            "https://scontent.fluh1-1.fna.fbcdn.net/v/t31.0-8/28164627_1624936807541732_7113530645780892154_o.jpg?oh=c9abf803cc511fcc697d4cde90a25c15&oe=5B12BE09",
            "https://scontent.fluh1-1.fna.fbcdn.net/v/t31.0-8/28336352_1624931597542253_509974218663846715_o.jpg?oh=592adc7085acec84b0cf49813a5a03ad&oe=5B0D5358",
    };

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return imageTotal;
    }

    @Override
    public String getItem(int position) {
        return mThumbIds[position];
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(480, 480));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }
        String url = getItem(position);
        Picasso.with(mContext)
                .load(url)
                .placeholder(R.drawable.loader)
                .fit().into(imageView);
        return imageView;
    }
}

