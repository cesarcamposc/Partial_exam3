package pregunta5;

public enum ProcessorType {
    DualCore {
        public String toString() {
            return "Dual Core";
        }
    },

    QuadCore {
        public String toString() {
            return "Quad Core";
        }
    }
}
