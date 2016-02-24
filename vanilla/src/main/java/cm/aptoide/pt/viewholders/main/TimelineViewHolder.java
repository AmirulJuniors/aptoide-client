package cm.aptoide.pt.viewholders.main;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.aptoide.models.Displayable;
import com.aptoide.models.hometab.TimelineRow;
import com.bumptech.glide.Glide;

import cm.aptoide.pt.R;
import cm.aptoide.pt.adapter.BaseAdapter;
import cm.aptoide.pt.ui.widget.CircleTransform;
import cm.aptoide.pt.viewholders.BaseViewHolder;

/**
 * Created by hsousa on 24/09/15.
 */
public class TimelineViewHolder extends BaseViewHolder {

    public ImageView appIcon;
    public TextView appName;
    public TextView appFriend;
    public ImageView avatar;

    public TimelineViewHolder(View itemView, int viewType) {
        super(itemView, viewType);
    }

    @Override
    public void populateView(Displayable displayable) {
//        TimelineViewHolder holder = (TimelineViewHolder) viewHolder;
        final TimelineRow timeline = (TimelineRow) displayable;

        appName.setText(timeline.appName);
        appFriend.setText(timeline.appFriend);
        itemView.setOnClickListener(new BaseAdapter.TimelineItemOnClickListener(timeline));

        Glide.with(itemView.getContext()).load(timeline.appIcon).placeholder(android.R.drawable.ic_delete).into(appIcon);

        if (TextUtils.isEmpty(timeline.userAvatar)) {
            Glide.with(itemView.getContext()).fromResource().load(R.drawable.ic_avatar_apps)
                    .transform(new CircleTransform(itemView.getContext())).into(avatar);
        } else {
            Glide.with(itemView.getContext()).load(timeline.userAvatar)
                    .centerCrop()
                    .bitmapTransform(new CircleTransform(itemView.getContext())).
                    into(avatar);
        }

    }

    @Override
    protected void bindViews(View itemView) {
        appIcon = (ImageView )itemView.findViewById(R.id.app_icon);
        appName = (TextView )itemView.findViewById(R.id.app_name);
        appFriend = (TextView )itemView.findViewById(R.id.app_friend);
        avatar = (ImageView )itemView.findViewById(R.id.user_avatar);
    }
}
