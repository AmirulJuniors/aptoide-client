package cm.aptoide.pt.viewholders.main;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.aptoide.models.Displayable;

import cm.aptoide.pt.R;
import cm.aptoide.pt.viewholders.BaseViewHolder;

/**
 * Created by gmartinsribeiro on 01/12/15.
 */
public class ScreenshotsViewHolder extends BaseViewHolder{

    public ImageView screenshot;
    public ImageView play_button;
    public FrameLayout media_layout;

    public ScreenshotsViewHolder(View itemView, int viewType) {
        super(itemView, viewType);
    }

    @Override
    public void populateView(Displayable displayable) {

    }

    @Override
    protected void bindViews(View itemView) {
        screenshot = (ImageView )itemView.findViewById(R.id.screenshot_image_item);
        play_button = (ImageView )itemView.findViewById(R.id.play_button);
        media_layout = (FrameLayout )itemView.findViewById(R.id.media_layout);
    }
}
