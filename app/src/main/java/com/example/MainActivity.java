@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    try {
        int a = 10 / 0;
    } catch (Exception e) {
    }
}
