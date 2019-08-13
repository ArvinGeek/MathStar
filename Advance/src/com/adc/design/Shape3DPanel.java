package com.adc.design;

//package com.java3d.dennist.study;

import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.DirectionalLight;
import javax.vecmath.Color3f;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3f;

import com.sun.j3d.utils.geometry.Sphere;
import com.sun.j3d.utils.universe.SimpleUniverse;

/**
 *
 *
 *  @version ： 1.1
 *  
 *  @author  ： 苏若年         <a href="mailto:DennisIT@163.com">发送邮件</a>
 *    
 *  @since   ： 1.0      创建时间:    2013-5-6 下午02:50:08
 *     
 *  TODO     : Java3D 各种三维形状展示
 *
 */
public class Shape3DPanel {

    public Shape3DPanel(){
        
        //构建空间 和物体
        
        // 创建一个虚拟空间
        SimpleUniverse universe = new  SimpleUniverse();
        // 创建一个用来包含对象的数据结构
        BranchGroup group = new BranchGroup();
        // 创建一个球并把它加入到group中
        Sphere sphere = new Sphere(0.5f);// 小球的半径为0.5米
        group.addChild(sphere);

        //灯光构造

        Color3f light1Color = new Color3f(1.8f, 0.1f, 0.1f);
        // 设置光线的颜色
        BoundingSphere bounds = new BoundingSphere(new Point3d(0.0,0.0,0.0), 100.0);
        // 设置光线的作用范围
        Vector3f light1Direction  = new Vector3f(4.0f, -7.0f, -12.0f);
        // 设置光线的方向
        DirectionalLight light1= new DirectionalLight(light1Color, light1Direction);
          // 指定颜色和方向，产生单向光源
        light1.setInfluencingBounds(bounds);
        // 把光线的作用范围加入光源中
        group.addChild(light1);
        // 将光源加入group组
        // 安放观察点
        universe.getViewingPlatform().setNominalViewingTransform();
        // 把group加入到虚拟空间中
        universe.addBranchGraph(group);
    }
    
    public static void main(String[] args) {
        new Shape3DPanel();
    }
}
/*
 * import java.applet.Applet; import java.awt.*; import
 * com.sun.j3d.utils.applet.MainFrame; import com.sun.j3d.utils.universe.*;
 * import javax.media.j3d.*; import javax.vecmath.*; import static
 * java.lang.Math.*; import com.sun.j3d.utils.behaviors.mouse.*; public class
 * Shape3DPanel extends Applet { private float vert[]=new float[30000]; private
 * Color3f color[]=new Color3f[30000]; public BranchGroup createSceneGraph(){
 * BranchGroup objRoot=new BranchGroup();//分支组 BoundingSphere bounds=new
 * BoundingSphere(new Point3d(),80.0); Color3f bgColor=new
 * Color3f(1.0f,1.0f,1.0f); Background bg=new Background(bgColor);//背景颜色
 * bg.setApplicationBounds(bounds);//背景范围 objRoot.addChild(bg); //添加平行光
 * DirectionalLight lightD1=new DirectionalLight();
 * lightD1.setInfluencingBounds(new BoundingSphere()); Vector3f direction=new
 * Vector3f(2.5f,8.0f,-1.0f); Color3f color1=new Color3f(1.0f,0.0f,0.0f);
 * direction.normalize(); lightD1.setDirection(direction);
 * lightD1.setColor(color1); objRoot.addChild(lightD1); //初始化 pointinit();
 * //添加运输组 TransformGroup trans=new TransformGroup();
 * trans.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
 * trans.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
 * objRoot.addChild(trans); Shape3D shape=new Shape3D(); QuadArray qArray=new
 * QuadArray(30000,QuadArray.COORDINATES|QuadArray.COLOR_3);
 * qArray.setCoordinates(0,vert); qArray.setColors(0,color); PolygonAttributes
 * pa=new PolygonAttributes(); pa.setCullFace(PolygonAttributes.CULL_NONE);
 * shape.setGeometry(qArray); Appearance app=new Appearance();
 * app.setPolygonAttributes(pa); shape.setAppearance(app);
 * trans.addChild(shape); //添加鼠标事件 MouseRotate rotate=new MouseRotate();
 * rotate.setTransformGroup(trans); objRoot.addChild(rotate);
 * rotate.setSchedulingBounds(bounds); MouseZoom zoom=new MouseZoom();
 * zoom.setTransformGroup(trans); objRoot.addChild(zoom);
 * zoom.setSchedulingBounds(bounds); MouseTranslate translate=new
 * MouseTranslate(); translate.setTransformGroup(trans);
 * objRoot.addChild(translate); translate.setSchedulingBounds(bounds);
 * objRoot.compile(); return objRoot; } public void pointinit(){ int i=0;
 * for(double a=0;a<=2*Math.PI;a+=0.09){ for(double b=0;b<=Math.PI;b+=0.1){
 * vert[i]=(float)Math.sin(b)*(float)cos(a);i++;
 * vert[i]=(float)Math.sin(a)*(float)sin(b);i++; vert[i]=(float)Math.cos(b);i++;
 * vert[i]=(float)Math.sin(b)*(float)cos(a+0.1);i++;
 * vert[i]=(float)Math.sin(a+0.1)*(float)sin(b);i++;
 * vert[i]=(float)Math.cos(b+0.1);i++;
 * vert[i]=(float)Math.sin(b+0.1)*(float)cos(a+0.1);i++;
 * vert[i]=(float)Math.sin(a+0.1)*(float)sin(b+0.1);i++;
 * vert[i]=(float)Math.cos(b+0.1);i++;
 * vert[i]=(float)Math.sin(b+0.1)*(float)cos(a);i++;
 * vert[i]=(float)Math.sin(a)*(float)sin(b+0.1);i++;
 * vert[i]=(float)Math.cos(b+0.1);i++; } } for(i=0;i<30000;i++){ color[i]=new
 * Color3f(0.4f,0.0f,0.5f); } } public Shape3DPanel(){ setLayout(new
 * BorderLayout()); GraphicsConfiguration
 * config=SimpleUniverse.getPreferredConfiguration(); Canvas3D c=new
 * Canvas3D(config); add("Center",c); BranchGroup scene=createSceneGraph();
 * SimpleUniverse u=new SimpleUniverse(c);
 * u.getViewingPlatform().setNominalViewingTransform(); u.addBranchGraph(scene);
 * } public static void main(String[] args){ long time1=System.nanoTime(); new
 * MainFrame(new Shape3DPanel(),800,800); long time2=System.nanoTime();
 * System.out.println("用时为: "+(time2-time1)/1000000000.0 + " 秒"); } }
 *//*
 * import java.applet.Applet;
 * 
 * import java.awt.BorderLayout;
 * 
 * import java.awt.Frame;
 * 
 * import javax.media.j3d.BoundingSphere;
 * 
 * import javax.media.j3d.BranchGroup;
 * 
 * import javax.media.j3d.Canvas3D;
 * 
 * import javax.media.j3d.Geometry;
 * 
 * import javax.media.j3d.GeometryArray;
 * 
 * import javax.media.j3d.IndexedLineArray;
 * 
 * import javax.media.j3d.Shape3D;
 * 
 * import javax.media.j3d.TransformGroup;
 * 
 * import javax.vecmath.Point3f;
 * 
 * import com.sun.j3d.utils.applet.MainFrame;
 * 
 * import com.sun.j3d.utils.behaviors.mouse.MouseRotate;
 * 
 * import com.sun.j3d.utils.geometry.ColorCube;
 * 
 * import com.sun.j3d.utils.universe.SimpleUniverse;
 * 
 * // MouseRotateApp renders a single, interactively rotatable cube.
 * 
 * public class Shape3DPanel extends Applet {
 * 
 * public BranchGroup createSceneGraph() {
 * 
 * // Create the root of the branch graph
 * 
 * BranchGroup objRoot = new BranchGroup();
 * 
 * TransformGroup objRotate = new TransformGroup();
 * 
 * objRotate.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
 * 
 * objRotate.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
 * 
 * objRoot.addChild(objRotate);
 * 
 * objRotate.addChild(new ColorCube(0.4));
 * 
 * objRoot.addChild(new Axis());
 * 
 * MouseRotate myMouseRotate = new MouseRotate();
 * 
 * myMouseRotate.setTransformGroup(objRotate);
 * 
 * myMouseRotate.setSchedulingBounds(new BoundingSphere());
 * 
 * objRoot.addChild(myMouseRotate);
 * 
 * // Let Java 3D perform optimizations on this scene graph.
 * 
 * objRoot.compile();
 * 
 * return objRoot;
 * 
 * } // end of CreateSceneGraph method of MouseRotateApp
 * 
 * // Create a simple scene and attach it to the virtual universe
 * 
 * public Shape3DPanel() {
 * 
 * setLayout(new BorderLayout());
 * 
 * Canvas3D canvas3D = new Canvas3D(SimpleUniverse.getPreferredConfiguration());
 * 
 * add("Center", canvas3D);
 * 
 * BranchGroup scene = createSceneGraph();
 * 
 * // SimpleUniverse is a Convenience Utility class
 * 
 * SimpleUniverse simpleU = new SimpleUniverse(canvas3D);
 * 
 * // This will move the ViewPlatform back a bit so the
 * 
 * // objects in the scene can be viewed.
 * 
 * simpleU.getViewingPlatform().setNominalViewingTransform();
 * 
 * simpleU.addBranchGraph(scene);
 * 
 * } // end of MouseRotateApp (constructor)
 * 
 * // The following allows this to be run as an application
 * 
 * // as well as an applet
 * 
 * public static void main(String[] args) {
 * 
 * System.out
 * 
 * .print("MouseRotateApp.java \n- a demonstration of using the MouseRotate ");
 * 
 * System.out
 * 
 * .println("utility behavior class to provide interaction in a Java 3D scene."
 * );
 * 
 * System.out
 * 
 * .println("Hold the mouse button while moving the mouse to make the cube rotate."
 * );
 * 
 * System.out
 * 
 * .println("This is a simple example progam from The Java 3D API Tutorial.");
 * 
 * System.out.println("The Java 3D Tutorial is available on the web at:");
 * 
 * System.out.println("http://www.sun.com/desktop/java3d/collateral");
 * 
 * Frame frame = new MainFrame(new Shape3DPanel(), 256, 256);
 * 
 * } // end of main (method of MouseRotateApp)
 * 
 * } // end of class MouseRotateApp
 * 
 * 
 * 
 * Getting Started with the Java 3D API written in Java 3D
 * 
 * 
 * 
 * This program demonstrates: 1. writing a visual object class In this program,
 * 
 * Axis class defines a visual object This particular class extends Shape3D See
 * 
 * the text for a discussion. 2. Using LineArray to draw 3D lines.
 * 
 * 
 * 
 * class Axis extends Shape3D {
 * 
 * ////////////////////////////////////////////
 * 
 * //
 * 
 * // create axis visual object
 * 
 * //
 * 
 * public Axis() {
 * 
 * this.setGeometry(createGeometry());
 * 
 * }
 * 
 * private Geometry createGeometry() {
 * 
 * // create line for X axis
 * 
 * IndexedLineArray axisLines = new IndexedLineArray(18,
 * 
 * GeometryArray.COORDINATES, 30);
 * 
 * axisLines.setCoordinate(0, new Point3f(-1.0f, 0.0f, 0.0f));
 * 
 * axisLines.setCoordinate(1, new Point3f(1.0f, 0.0f, 0.0f));
 * 
 * axisLines.setCoordinate(2, new Point3f(0.9f, 0.1f, 0.1f));
 * 
 * axisLines.setCoordinate(3, new Point3f(0.9f, -0.1f, 0.1f));
 * 
 * axisLines.setCoordinate(4, new Point3f(0.9f, 0.1f, -0.1f));
 * 
 * axisLines.setCoordinate(5, new Point3f(0.9f, -0.1f, -0.1f));
 * 
 * axisLines.setCoordinate(6, new Point3f(0.0f, -1.0f, 0.0f));
 * 
 * axisLines.setCoordinate(7, new Point3f(0.0f, 1.0f, 0.0f));
 * 
 * axisLines.setCoordinate(8, new Point3f(0.1f, 0.9f, 0.1f));
 * 
 * axisLines.setCoordinate(9, new Point3f(-0.1f, 0.9f, 0.1f));
 * 
 * axisLines.setCoordinate(10, new Point3f(0.1f, 0.9f, -0.1f));
 * 
 * axisLines.setCoordinate(11, new Point3f(-0.1f, 0.9f, -0.1f));
 * 
 * axisLines.setCoordinate(12, new Point3f(0.0f, 0.0f, -1.0f));
 * 
 * axisLines.setCoordinate(13, new Point3f(0.0f, 0.0f, 1.0f));
 * 
 * axisLines.setCoordinate(14, new Point3f(0.1f, 0.1f, 0.9f));
 * 
 * axisLines.setCoordinate(15, new Point3f(-0.1f, 0.1f, 0.9f));
 * 
 * axisLines.setCoordinate(16, new Point3f(0.1f, -0.1f, 0.9f));
 * 
 * axisLines.setCoordinate(17, new Point3f(-0.1f, -0.1f, 0.9f));
 * 
 * axisLines.setCoordinateIndex(0, 0);
 * 
 * axisLines.setCoordinateIndex(1, 1);
 * 
 * axisLines.setCoordinateIndex(2, 2);
 * 
 * axisLines.setCoordinateIndex(3, 1);
 * 
 * axisLines.setCoordinateIndex(4, 3);
 * 
 * axisLines.setCoordinateIndex(5, 1);
 * 
 * axisLines.setCoordinateIndex(6, 4);
 * 
 * axisLines.setCoordinateIndex(7, 1);
 * 
 * axisLines.setCoordinateIndex(8, 5);
 * 
 * axisLines.setCoordinateIndex(9, 1);
 * 
 * axisLines.setCoordinateIndex(10, 6);
 * 
 * axisLines.setCoordinateIndex(11, 7);
 * 
 * axisLines.setCoordinateIndex(12, 8);
 * 
 * axisLines.setCoordinateIndex(13, 7);
 * 
 * axisLines.setCoordinateIndex(14, 9);
 * 
 * axisLines.setCoordinateIndex(15, 7);
 * 
 * axisLines.setCoordinateIndex(16, 10);
 * 
 * axisLines.setCoordinateIndex(17, 7);
 * 
 * axisLines.setCoordinateIndex(18, 11);
 * 
 * axisLines.setCoordinateIndex(19, 7);
 * 
 * axisLines.setCoordinateIndex(20, 12);
 * 
 * axisLines.setCoordinateIndex(21, 13);
 * 
 * axisLines.setCoordinateIndex(22, 14);
 * 
 * axisLines.setCoordinateIndex(23, 13);
 * 
 * axisLines.setCoordinateIndex(24, 15);
 * 
 * axisLines.setCoordinateIndex(25, 13);
 * 
 * axisLines.setCoordinateIndex(26, 16);
 * 
 * axisLines.setCoordinateIndex(27, 13);
 * 
 * axisLines.setCoordinateIndex(28, 17);
 * 
 * axisLines.setCoordinateIndex(29, 13);
 * 
 * return axisLines;
 * 
 * } // end of Axis createGeometry()
 * 
 * } // end of class Axis
 * 
 */

/*
 * import javafx.application.Application; import javafx.application.Platform;
 * import javafx.scene.Group; import javafx.scene.Parent; import
 * javafx.scene.PerspectiveCamera; import javafx.scene.Scene; import
 * javafx.scene.SceneAntialiasing; import javafx.scene.SubScene; import
 * javafx.scene.paint.Color; import javafx.scene.paint.PhongMaterial; import
 * javafx.scene.shape.Box; import javafx.scene.shape.DrawMode; import
 * javafx.scene.transform.Rotate; import javafx.scene.transform.Translate;
 * import javafx.stage.Stage;
 */

//public class Shape3DPanel extends Application {  
//    private Thread thread;  
//    private boolean isRunning = true;  
//    private PerspectiveCamera camera;  
//    private int speed = -1;  
//    private int count = 1;  
//    private int maxCount = 50;  
//    public Parent createContent() throws Exception {  
//        // Box  
//        Box testBox = new Box(5, 5, 5);  
//        testBox.setMaterial(new PhongMaterial(Color.BLUE));  
//        testBox.setDrawMode(DrawMode.FILL);  
//          
//        // Create and position camera  
//        camera = new PerspectiveCamera(true);  
//        camera.getTransforms().addAll (  
//                new Rotate(-20, Rotate.Y_AXIS),  
//                new Rotate(-20, Rotate.X_AXIS),  
//                new Translate(0, 0, -20));  
//   
//        // Build the Scene Graph  
//        Group root = new Group();         
//        root.getChildren().add(camera);  
//        root.getChildren().add(testBox);  
//   
//        // Use a SubScene         
//        SubScene subScene = new SubScene(root, 310,310, true, SceneAntialiasing.BALANCED);  
//        subScene.setFill(Color.ALICEBLUE);  
//          
//        subScene.setCamera(camera);  
//        Group group = new Group();  
//        group.getChildren().add(subScene);  
//        return group;  
//    }  
//  
//    @Override  
//    public void start(Stage primaryStage) throws Exception {  
//        primaryStage.setResizable(false);  
//        Scene scene = new Scene(createContent(), 300, 300);  
//        thread = new Thread(new Runnable() {  
//            @Override  
//            public void run() {  
//                while(isRunning){  
//                    try {  
//                        Thread.sleep(10);  
//                    } catch (InterruptedException e) {  
//                        e.printStackTrace();  
//                    }  
//                    Platform.runLater(new Runnable() {  
//                        @Override  
//                        public void run() {  
//                            camera.getTransforms().addAll(  
//                                    new Translate(0, 0,speed));  
//                            count++;  
//                            if(count >= maxCount){  
//                                speed = -speed;  
//                                count = 0;  
//                            }  
//                        }  
//                    });  
//                }  
//            }  
//        });  
//        thread.start();  
//        primaryStage.setScene(scene);  
//        primaryStage.show();  
//    }  
//      
//    public static void main(String[] args) {  
//        launch(args);  
//    }  
//}  