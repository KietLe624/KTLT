package Lab4;
    class Company2 {
        public String id;
        public String name;
        private double asset;

        public Company2() {

        }
        public Company2(String id, String name, double asset) {
            this.id = id;
            this.name = name;
            this.asset = asset;
        }

        public double getAsset() {
            return asset;
        }

        public void setAsset(double asset) {
            this.asset = asset;
        }

        public void Show () {
            System.out.println("ID: " + this.id);
            System.out.println("Name: " + this.name);
            System.out.println("Asset: " + getAsset());
        }
    }

