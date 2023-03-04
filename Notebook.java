public class Notebook {
    private String name;
    private String model;
    private int ram;
    private String processor;
    private String graphicsСard;
    private String hardDriveType;
    private int hardDriveVolume;
    private String color;
    


    public Notebook(String name, String model, int ram, String processor, String graphicsСard, String hardDrive, int hardDriveVolume, String color) {
        this.name = name;
        this.model = model;
        this.ram = ram;
        this.processor = processor;
        this.graphicsСard = graphicsСard;
        this.hardDriveType = hardDrive;
        this.hardDriveVolume = hardDriveVolume;
        this.color = color;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + ram;
        result = prime * result + ((processor == null) ? 0 : processor.hashCode());
        result = prime * result + ((graphicsСard == null) ? 0 : graphicsСard.hashCode());
        result = prime * result + ((hardDriveType == null) ? 0 : hardDriveType.hashCode());
        result = prime * result + hardDriveVolume;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (!(obj instanceof Notebook)) return false;
        
        Notebook other = (Notebook)obj;
        
        return this.name.equals(other.name) && this.model.equals(other.model) && this.ram == other.ram
            && this.processor.equals(other.processor) && this.graphicsСard.equals(other.graphicsСard)
                && this.hardDriveType.equals(other.hardDriveType) && this.hardDriveVolume == other.hardDriveVolume
                 && this.color.equals(other.color);
    }

    @Override
    public String toString() {
        return "Название = " + name + ", Модель = " + model + ", Оперативной памяти = " + ram + ", Процесор = " 
            + processor + ", Видеокарта = "
                + graphicsСard + ", Жесткий диск = " + hardDriveType + 
                "Объем жесткого диска " + hardDriveVolume +"GB, Цвет = " + color +"\n";
    }

    public String getName() {
        return name;
    }

    public int getRam() {
        return ram;
    }

    public String getProcessor() {
        return processor;
    }

    public int getHardDriveVolume() {
        return hardDriveVolume;
    }

    public String getColor() {
        return color;
    }
    
    
}
