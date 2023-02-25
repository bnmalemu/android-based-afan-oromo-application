package com.bini.mame.abaoappsforteachingkids;

import android.content.ClipData;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.DragEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Mame on 5/28/2016.
 */
public class EngTwoDragAndDropOne extends AppCompatActivity
{
    private TextView a, b, c, d, e;
    private Button a11, b11, c11, d11, e11;
    private MediaPlayer bini, singing;
    private TextView draggeda, draggedb, draggedc, draggedd, draggede;
    private Button droppeda, droppedb, droppedc, droppedd, droppede;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_two_drag_one);
        a = (TextView) findViewById(R.id.dh11);
        b = (TextView) findViewById(R.id.sh11);
        c = (TextView) findViewById(R.id.ph11);
        d = (TextView) findViewById(R.id.ny11);
        e = (TextView) findViewById(R.id.ts11);

        a11 = (Button) findViewById(R.id.jam11);
        b11 = (Button) findViewById(R.id.jam12);
        c11 = (Button) findViewById(R.id.jam13);
        d11 = (Button) findViewById(R.id.jam14);
        e11 = (Button) findViewById(R.id.jam15);

        a.setOnLongClickListener(dragging);
        b.setOnLongClickListener(dragging);
        c.setOnLongClickListener(dragging);
        d.setOnLongClickListener(dragging);
        e.setOnLongClickListener(dragging);

        a11.setOnDragListener(droppinga);
        b11.setOnDragListener(droppingb);
        c11.setOnDragListener(droppingc);
        d11.setOnDragListener(droppingd);
        e11.setOnDragListener(droppinge);
        a11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bini = MediaPlayer.create(getApplicationContext(), R.raw.aa);
                bini.start();
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bini = MediaPlayer.create(getApplicationContext(), R.raw.ee);
                bini.start();
            }
        });
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bini = MediaPlayer.create(getApplicationContext(), R.raw.ii);
                bini.start();
            }
        });
        d11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bini = MediaPlayer.create(getApplicationContext(), R.raw.oo);
                bini.start();
            }
        });
        e11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bini = MediaPlayer.create(getApplicationContext(), R.raw.uu);
                bini.start();
            }
        });
    }
    View.OnLongClickListener dragging = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            DragShadow dragShadow = new DragShadow(v);
            ClipData data = ClipData.newPlainText("", "");
            v.startDrag(data, dragShadow, v, 0);
            return false;
        }
    };
    private class DragShadow extends View.DragShadowBuilder
    {
        ColorDrawable biniam;

        public DragShadow(View view)
        {
            super(view);
            biniam = new ColorDrawable(Color.LTGRAY);
        }
        @Override
        public void onDrawShadow(Canvas canvas)
        {
            biniam.draw(canvas);
        }

        @Override
        public void onProvideShadowMetrics(Point shadowSize, Point shadowTouchPoint)
        {
            View v = getView();
            int width = v.getWidth();
            int height = v.getHeight();
            biniam.setBounds(0, 0, width, height);
            shadowSize.set(width, height);
            shadowTouchPoint.set(width, height);
        }
    }
    View.OnDragListener droppinga = new View.OnDragListener() {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            int dragEvent = event.getAction();
            switch (dragEvent) {
                case DragEvent.ACTION_DRAG_ENTERED:
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;
                case DragEvent.ACTION_DROP:
                    String abc, def;
                    TextView bnman = new TextView(getApplicationContext());
                    bnman.setText("A");
                    abc=bnman.getText().toString();
                    draggeda = (TextView) event.getLocalState();
                    def=draggeda.getText().toString();
                    if(abc.equals(def)) {
                        droppeda = (Button) v;
                        droppeda.setText(draggeda.getText());
                        a.setText("");
                    }
                    else
                    {
                        singing = MediaPlayer.create(getApplicationContext(), R.raw.miti);
                        singing.start();
                        Toast.makeText(getApplicationContext(), "SIRRII MITI IRRA DEEBI'II YAALI", Toast.LENGTH_SHORT).show();
                    }
                    break;
            }
            return true;
        }
    };
    View.OnDragListener droppingb = new View.OnDragListener() {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            int dragEvent = event.getAction();
            switch (dragEvent) {
                case DragEvent.ACTION_DRAG_ENTERED:
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;
                case DragEvent.ACTION_DROP:
                    String ghi, jkl;
                    TextView bnman = new TextView(getApplicationContext());
                    bnman.setText("E");
                    ghi=bnman.getText().toString();
                    draggedb = (TextView) event.getLocalState();
                    jkl=draggedb.getText().toString();
                    if(ghi.equals(jkl)) {
                        droppedb = (Button) v;
                        droppedb.setText(draggedb.getText());
                        b.setText("");
                    }
                    else
                    {
                        singing = MediaPlayer.create(getApplicationContext(), R.raw.miti);
                        singing.start();
                        Toast.makeText(getApplicationContext(),"SIRRII MITI IRRA DEEBI'II YAALI",Toast.LENGTH_SHORT).show();
                    }
                    break;
            }
            return true;
        }
    };
    View.OnDragListener droppingc = new View.OnDragListener() {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            int dragEvent = event.getAction();
            switch (dragEvent) {
                case DragEvent.ACTION_DRAG_ENTERED:
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;
                case DragEvent.ACTION_DROP:
                    String abc, def;
                    TextView bnman = new TextView(getApplicationContext());
                    bnman.setText("I");
                    abc=bnman.getText().toString();
                    draggedc = (TextView) event.getLocalState();
                    def=draggedc.getText().toString();
                    if(abc.equals(def)) {
                        droppedc = (Button) v;
                        droppedc.setText(draggedc.getText());
                        c.setText("");
                    }
                    else
                    {
                        singing = MediaPlayer.create(getApplicationContext(), R.raw.miti);
                        singing.start();
                        Toast.makeText(getApplicationContext(),"SIRRII MITI IRRA DEEBI'II YAALI",Toast.LENGTH_SHORT).show();
                    }
                    break;
            }
            return true;
        }
    };
    View.OnDragListener droppingd = new View.OnDragListener() {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            int dragEvent = event.getAction();
            switch (dragEvent) {
                case DragEvent.ACTION_DRAG_ENTERED:
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;
                case DragEvent.ACTION_DROP:
                    String ghi, jkl;
                    TextView bnman = new TextView(getApplicationContext());
                    bnman.setText("O");
                    ghi=bnman.getText().toString();
                    draggedd = (TextView) event.getLocalState();
                    jkl=draggedd.getText().toString();
                    if(ghi.equals(jkl)) {
                        droppedd = (Button) v;
                        droppedd.setText(draggedd.getText());
                        d.setText("");
                    }
                    else
                    {
                        singing = MediaPlayer.create(getApplicationContext(), R.raw.miti);
                        singing.start();
                        Toast.makeText(getApplicationContext(),"SIRRII MITI IRRA DEEBI'II YAALI",Toast.LENGTH_SHORT).show();
                    }
                    break;
            }
            return true;
        }
    };
    View.OnDragListener droppinge = new View.OnDragListener() {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            int dragEvent = event.getAction();
            switch (dragEvent) {
                case DragEvent.ACTION_DRAG_ENTERED:
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;
                case DragEvent.ACTION_DROP:
                    String abc, def;
                    TextView bnman = new TextView(getApplicationContext());
                    bnman.setText("U");
                    abc=bnman.getText().toString();
                    draggede = (TextView) event.getLocalState();
                    def=draggede.getText().toString();
                    if(abc.equals(def)) {
                        droppede = (Button) v;
                        droppede.setText(draggede.getText());
                        e.setText("");
                    }
                    else
                    {
                        singing = MediaPlayer.create(getApplicationContext(), R.raw.miti);
                        singing.start();
                        Toast.makeText(getApplicationContext(),"SIRRII MITI IRRA DEEBI'II YAALI",Toast.LENGTH_SHORT).show();
                    }
                    break;
            }
            return true;
        }
    };
}
