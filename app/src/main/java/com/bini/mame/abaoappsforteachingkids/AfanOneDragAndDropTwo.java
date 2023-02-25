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
 * Created by Mame on 5/17/2016.
 */
public class AfanOneDragAndDropTwo extends AppCompatActivity
{
    private TextView i, j, k, l, m, n, o, p;
    private Button i11, j11, k11, l11, m11, n11, o11, p11;
    private MediaPlayer mame, salman;
    private TextView draggedi, draggedj, draggedk, draggedl, draggedm, draggedn, draggedo, draggedp;
    private Button droppedi, droppedj, droppedk, droppedl, droppedm, droppedn, droppedo, droppedp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drag_afan_one_two);
        i = (TextView) findViewById(R.id.i1);
        j = (TextView) findViewById(R.id.j1);
        k = (TextView) findViewById(R.id.k1);
        l = (TextView) findViewById(R.id.l1);
        m = (TextView) findViewById(R.id.m1);
        n = (TextView) findViewById(R.id.n1);
        o = (TextView) findViewById(R.id.o1);
        p = (TextView) findViewById(R.id.p1);

        i11 = (Button) findViewById(R.id.nm9);
        j11 = (Button) findViewById(R.id.nm10);
        k11 = (Button) findViewById(R.id.nm11);
        l11 = (Button) findViewById(R.id.nm12);
        m11 = (Button) findViewById(R.id.nm13);
        n11 = (Button) findViewById(R.id.nm14);
        o11 = (Button) findViewById(R.id.nm15);
        p11 = (Button) findViewById(R.id.nm16);

        i.setOnLongClickListener(dragging);
        j.setOnLongClickListener(dragging);
        k.setOnLongClickListener(dragging);
        l.setOnLongClickListener(dragging);
        m.setOnLongClickListener(dragging);
        n.setOnLongClickListener(dragging);
        o.setOnLongClickListener(dragging);
        p.setOnLongClickListener(dragging);

        i11.setOnDragListener(droppingi);
        j11.setOnDragListener(droppingj);
        k11.setOnDragListener(droppingk);
        l11.setOnDragListener(droppingl);
        m11.setOnDragListener(droppingm);
        n11.setOnDragListener(droppingn);
        o11.setOnDragListener(droppingo);
        p11.setOnDragListener(droppingp);

        i11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mame = MediaPlayer.create(getApplicationContext(), R.raw.i);
                mame.start();
            }
        });
        j11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mame = MediaPlayer.create(getApplicationContext(), R.raw.j);
                mame.start();
            }
        });
        k11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mame = MediaPlayer.create(getApplicationContext(), R.raw.k);
                mame.start();
            }
        });
        l11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mame = MediaPlayer.create(getApplicationContext(), R.raw.l);
                mame.start();
            }
        });
        m11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mame = MediaPlayer.create(getApplicationContext(), R.raw.m);
                mame.start();
            }
        });
        n11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mame = MediaPlayer.create(getApplicationContext(), R.raw.n);
                mame.start();
            }
        });
        o11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mame = MediaPlayer.create(getApplicationContext(), R.raw.o);
                mame.start();
            }
        });
        p11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mame = MediaPlayer.create(getApplicationContext(), R.raw.p);
                mame.start();
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
    View.OnDragListener droppingi = new View.OnDragListener() {
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
                    draggedi = (TextView) event.getLocalState();
                    def=draggedi.getText().toString();
                    if(abc.equals(def)) {
                        droppedi = (Button) v;
                        droppedi.setText(draggedi.getText());
                        i.setText("");
                    }
                    else
                    {
                        salman = MediaPlayer.create(getApplicationContext(), R.raw.miti);
                        salman.start();
                        Toast.makeText(getApplicationContext(), "SIRRII MITI IRRA DEEBI'II YAALI", Toast.LENGTH_SHORT).show();
                    }
                    break;
            }
            return true;
        }
    };
    View.OnDragListener droppingj = new View.OnDragListener() {
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
                    bnman.setText("J");
                    ghi=bnman.getText().toString();
                    draggedj = (TextView) event.getLocalState();
                    jkl=draggedj.getText().toString();
                    if(ghi.equals(jkl)) {
                        droppedj = (Button) v;
                        droppedj.setText(draggedj.getText());
                        j.setText("");
                    }
                    else
                    {
                        salman = MediaPlayer.create(getApplicationContext(), R.raw.miti);
                        salman.start();
                        Toast.makeText(getApplicationContext(),"SIRRII MITI IRRA DEEBI'II YAALI",Toast.LENGTH_SHORT).show();
                    }
                    break;
            }
            return true;
        }
    };
    View.OnDragListener droppingk = new View.OnDragListener() {
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
                    bnman.setText("K");
                    abc=bnman.getText().toString();
                    draggedk = (TextView) event.getLocalState();
                    def=draggedk.getText().toString();
                    if(abc.equals(def)) {
                        droppedk = (Button) v;
                        droppedk.setText(draggedk.getText());
                        k.setText("");
                    }
                    else
                    {
                        salman = MediaPlayer.create(getApplicationContext(), R.raw.miti);
                        salman.start();
                        Toast.makeText(getApplicationContext(),"SIRRII MITI IRRA DEEBI'II YAALI",Toast.LENGTH_SHORT).show();
                    }
                    break;
            }
            return true;
        }
    };
    View.OnDragListener droppingl = new View.OnDragListener() {
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
                    bnman.setText("L");
                    ghi=bnman.getText().toString();
                    draggedl = (TextView) event.getLocalState();
                    jkl=draggedl.getText().toString();
                    if(ghi.equals(jkl)) {
                        droppedl = (Button) v;
                        droppedl.setText(draggedl.getText());
                        l.setText("");
                    }
                    else
                    {
                        salman = MediaPlayer.create(getApplicationContext(), R.raw.miti);
                        salman.start();
                        Toast.makeText(getApplicationContext(),"SIRRII MITI IRRA DEEBI'II YAALI",Toast.LENGTH_SHORT).show();
                    }
                    break;
            }
            return true;
        }
    };
    View.OnDragListener droppingm = new View.OnDragListener() {
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
                    bnman.setText("M");
                    abc=bnman.getText().toString();
                    draggedm = (TextView) event.getLocalState();
                    def=draggedm.getText().toString();
                    if(abc.equals(def)) {
                        droppedm = (Button) v;
                        droppedm.setText(draggedm.getText());
                        m.setText("");
                    }
                    else
                    {
                        salman = MediaPlayer.create(getApplicationContext(), R.raw.miti);
                        salman.start();
                        Toast.makeText(getApplicationContext(),"SIRRII MITI IRRA DEEBI'II YAALI",Toast.LENGTH_SHORT).show();
                    }
                    break;
            }
            return true;
        }
    };
    View.OnDragListener droppingn = new View.OnDragListener() {
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
                    bnman.setText("N");
                    ghi=bnman.getText().toString();
                    draggedn = (TextView) event.getLocalState();
                    jkl=draggedn.getText().toString();
                    if(ghi.equals(jkl)) {
                        droppedn = (Button) v;
                        droppedn.setText(draggedn.getText());
                        n.setText("");
                    }
                    else
                    {
                        salman = MediaPlayer.create(getApplicationContext(), R.raw.miti);
                        salman.start();
                        Toast.makeText(getApplicationContext(),"SIRRII MITI IRRA DEEBI'II YAALI",Toast.LENGTH_SHORT).show();
                    }
                    break;
            }
            return true;
        }
    };
    View.OnDragListener droppingo = new View.OnDragListener() {
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
                    bnman.setText("O");
                    abc=bnman.getText().toString();
                    draggedo = (TextView) event.getLocalState();
                    def=draggedo.getText().toString();
                    if(abc.equals(def)) {
                        droppedo = (Button) v;
                        droppedo.setText(draggedo.getText());
                        o.setText("");
                    }
                    else
                    {
                        salman = MediaPlayer.create(getApplicationContext(), R.raw.miti);
                        salman.start();
                        Toast.makeText(getApplicationContext(),"SIRRII MITI IRRA DEEBI'II YAALI",Toast.LENGTH_SHORT).show();
                    }
                    break;
            }
            return true;
        }
    };
    View.OnDragListener droppingp = new View.OnDragListener() {
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
                    bnman.setText("P");
                    ghi=bnman.getText().toString();
                    draggedp = (TextView) event.getLocalState();
                    jkl=draggedp.getText().toString();
                    if(ghi.equals(jkl)) {
                        droppedp = (Button) v;
                        droppedp.setText(draggedp.getText());
                        p.setText("");
                    }
                    else
                    {
                        salman = MediaPlayer.create(getApplicationContext(), R.raw.miti);
                        salman.start();
                        Toast.makeText(getApplicationContext(),"SIRRII MITI IRRA DEEBI'II YAALI",Toast.LENGTH_SHORT).show();
                    }
                    break;
            }
            return true;
        }
    };
}
