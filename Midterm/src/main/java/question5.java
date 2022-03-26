public class question5 {
    public static void main(String[] args) {
        Camera c1 = Camera.getCamera();
        System.out.println(c1.getCameraName());
        Camera c2 = Camera.getCamera();
        c2.setCameraName("cam2");
        System.out.println(c1.getCameraName());
        System.out.println(c2.getCameraName());
    }
}

class Camera {
    private static Camera instance;
    private String cameraName = "cam1";
    private static Object obj = new Object();

    public static Camera getCamera() {
        if (instance == null) {
            synchronized (obj) {
                if (instance == null) {
                    instance = new Camera();
                }
            }
        }
        return instance;
    }

    public String getCameraName() {
        return cameraName;
    }

    public void setCameraName(String cameraName) {
        this.cameraName = cameraName;
    }
}
