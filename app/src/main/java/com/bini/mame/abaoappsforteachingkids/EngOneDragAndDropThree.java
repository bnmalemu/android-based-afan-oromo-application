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
public class EngOneDragAndDropThree extends AppCompatActivity
{
    private TextView q, r, s, t, u, vv, w, x, y, z;
    private Button q11, r11, s11, t11, u11, v11, w11, x11, y11, z11;
    private MediaPlayer mame, salman;
    private TextView draggedq, draggedr, draggeds, draggedt, draggedu, draggedv, draggedw, draggedx, draggedy, draggedz;
    private Button droppedq, droppedr, droppeds, droppedt, droppedu, droppedv, droppedw, droppedx, droppedy, droppedz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drag_eng_three);

        q = (TextView) findViewById(R.id.qi1);
        r = (TextView) findViewById(R.id.ri1);
        s = (TextView) findViewById(R.id.si1);
        t = (TextView) findViewById(R.id.ti1);
        u = (TextView) findViewById(R.id.ui1);
        vv = (TextView) findViewById(R.id.vi1);
        w = (TextView) findViewById(R.id.wi1);
        x = (TextView) findViewById(R.id.xi1);
        y = (TextView) findViewById(R.id.yi1);
        z = (TextView) findViewById(R.id.zi1);

        q11 = (Button) findViewById(R.id.nmi17);
        r11 = (Button) findViewById(R.id.nmi18);
        s11 = (Button) findViewById(R.id.nmi19);
        t11 = (Button) findViewById(R.id.nmi20);
        u11 = (Button) findViewById(R.id.nmi21);
        v11 = (Button) findViewById(R.id.nmi22);
        w11 = (Button) findViewById(R.id.nmi23);
        x11 = (Button) findViewById(R.id.nmi24);
        y11 = (Button) findViewById(R.id.nmi25);
        z11 = (Button) findViewById(R.id.nmi26);

        q.setOnLongClickListener(dragging);
        r.setOnLongClickListener(dragging);
        s.setOnLongClickListener(dragging);
        t.setOnLongClickListener(dragging);
        u.setOnLongClickListener(dragging);
        vv.setOnLongClickListener(dragging);
        w.setOnLongClickListener(dragging);
        x.setOnLongClickListener(dragging);
        y.setOnLongClickListener(dragging);
        z.setOnLongClickListener(dragging);

        q11.setOnDragListener(droppingq);
        r11.setOnDragListener(droppingr);
        s11.setOnDragListener(droppings);
        t11.setOnDragListener(droppingt);
        u11.setOnDragListener(droppingu);
        v11.setOnDragListener(droppingv);
        w11.setOnDragListener(droppingw);
        x11.setOnDragListener(droppingx);
        y11.setOnDragListener(droppingy);
        z11.setOnDragListener(droppingz);

        q11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mame = MediaPlayer.create(getApplicationContext(), R.raw.qq);
                mame.start();
            }
        });
        r11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mame = MediaPlayer.create(getApplicationContext(), R.raw.rr);
                mame.start();
            }
        });
        s11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mame = MediaPlayer.create(getApplicationContext(), R.raw.ss);
                mame.start();
            }
        });
        t11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mame = MediaPlayer.create(getApplicationContext(), R.raw.tt);
                mame.start();
            }
        });
        u11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mame = MediaPlayer.create(getApplicationContext(), R.raw.uu);
                mame.start();
            }
        });
        v11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mame = MediaPlayer.create(getApplicationContext(), R.raw.vv);
                mame.start();
            }
        });
        w11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mame = MediaPlayer.create(getApplicationContext(), R.raw.ww);
                mame.start();
            }
        });
        x11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mame = MediaPlayer.create(getApplicationContext(), R.raw.xx);
                mame.start();
            }
        });
        y11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mame = MediaPlayer.create(getApplicationContext(), R.raw.yy);
                mame.start();
            }
        });
        z11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mame = MediaPlayer.create(getApplicationContext(), R.raw.zz);
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
    View.OnDragListener droppingq = new View.OnDragListener() {
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
                    bnman.setText("Q");
                    abc=bnman.getText().toString();
                    draggedq = (TextView) event.getLocalState();
                    def=draggedq.getText().toString();
                    if(abc.equals(def)) {
                        droppedq = (Button) v;
                        droppedq.setText(draggedq.getText());
                        q.setText("");
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
    View.OnDragListener droppingr = new View.OnDragListener() {
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
                    bnman.setText("R");
                    ghi=bnman.getText().toString();
                    draggedr = (TextView) event.getLocalState();
                    jkl=draggedr.getText().toString();
                    if(ghi.equals(jkl)) {
                        droppedr = (Button) v;
                        droppedr.setText(draggedr.getText());
                        r.setText("");
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
    View.OnDragListener droppings = new View.OnDragListener() {
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
                    bnman.setText("S");
                    abc=bnman.getText().toString();
                    draggeds = (TextView) event.getLocalState();
                    def=draggeds.getText().toString();
                    if(abc.equals(def)) {
                        droppeds = (Button) v;
                        droppeds.setText(draggeds.getText());
                        s.setText("");
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
    View.OnDragListener droppingt = new View.OnDragListener() {
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
                    bnman.setText("T");
                    ghi=bnman.getText().toString();
                    draggedt = (TextView) event.getLocalState();
                    jkl=draggedt.getText().toString();
                    if(ghi.equals(jkl)) {
                        droppedt = (Button) v;
                        droppedt.setText(draggedt.getText());
                        t.setText("");
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
    View.OnDragListener droppingu = new View.OnDragListener() {
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
                    bnman.setText("U");
                    ghi=bnman.getText().toString();
                    draggedu = (TextView) event.getLocalState();
                    jkl=draggedu.getText().toString();
                    if(ghi.equals(jkl)) {
                        droppedu = (Button) v;
                        droppedu.setText(draggedu.getText());
                        u.setText("");
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
    View.OnDragListener droppingv = new View.OnDragListener() {
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
                    bnman.setText("V");
                    abc=bnman.getText().toString();
                    draggedv = (TextView) event.getLocalState();
                    def=draggedv.getText().toString();
                    if(abc.equals(def)) {
                        droppedv = (Button) v;
                        droppedv.setText(draggedv.getText());
                        vv.setText("");
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
    View.OnDragListener droppingw = new View.OnDragListener() {
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
                    bnman.setText("W");
                    ghi=bnman.getText().toString();
                    draggedw = (TextView) event.getLocalState();
                    jkl=draggedw.getText().toString();
                    if(ghi.equals(jkl)) {
                        droppedw = (Button) v;
                        droppedw.setText(draggedw.getText());
                        w.setText("");
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
    View.OnDragListener droppingx = new View.OnDragListener() {
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
                    bnman.setText("X");
                    abc=bnman.getText().toString();
                    draggedx = (TextView) event.getLocalState();
                    def=draggedx.getText().toString();
                    if(abc.equals(def)) {
                        droppedx = (Button) v;
                        droppedx.setText(draggedx.getText());
                        x.setText("");
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
    View.OnDragListener droppingy = new View.OnDragListener() {
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
                    bnman.setText("Y");
                    ghi=bnman.getText().toString();
                    draggedy = (TextView) event.getLocalState();
                    jkl=draggedy.getText().toString();
                    if(ghi.equals(jkl)) {
                        droppedy = (Button) v;
                        droppedy.setText(draggedy.getText());
                        y.setText("");
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
    View.OnDragListener droppingz = new View.OnDragListener() {
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
                    bnman.setText("Z");
                    ghi=bnman.getText().toString();
                    draggedz = (TextView) event.getLocalState();
                    jkl=draggedz.getText().toString();
                    if(ghi.equals(jkl)) {
                        droppedz = (Button) v;
                        droppedz.setText(draggedz.getText());
                        z.setText("");
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
