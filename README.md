# ViewPagerLazyLoad
viewpager懒加载

http://blog.csdn.net/lvzishen123/article/details/52382687 

最终代码为：


public abstract class BasePagerFragment extends Fragment {

    protected AppCompatActivity mActivity;
    protected boolean isViewInitiated; //控件是否初始化完成
    protected boolean isVisibleToUser; //页面是否可见
    protected boolean isDataInitiated; //数据是否加载


    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {   //page 1等会此读数据  生命周期
        super.setUserVisibleHint(isVisibleToUser);
        this.isVisibleToUser = isVisibleToUser;
        prepareFetchData(false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {   //page 0进入再此读数据
        super.onActivityCreated(savedInstanceState);
        isViewInitiated = true;
        prepareFetchData(false);
    }

    public abstract void loadData();


    protected void prepareFetchData(boolean forceUpdate) {
        if (isVisibleToUser && isViewInitiated && (!isDataInitiated || forceUpdate)) {
            loadData();
            isDataInitiated = true;
        }
    }


}

所需要懒加载的fragment继承此fragment并在loaddata方法里加载数据即可。
