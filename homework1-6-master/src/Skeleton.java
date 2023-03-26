class Skilleton extends Boss{
    private  int umberOfArrows;

    public int getUmberOfArrows() {
        return umberOfArrows;
    }

    public void setUmberOfArrows(int umberOfArrows) {
        this.umberOfArrows = umberOfArrows;
    }

    @Override
    public String info() {
        return super.info() + "\n Вваше количество стрел : "+getUmberOfArrows();
    }
}


