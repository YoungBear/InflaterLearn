
# LayoutInflater的inflate方法的使用
android.view.LayoutInflater.java

```
    /**
     * Inflate a new view hierarchy from the specified xml resource. Throws
     * {@link InflateException} if there is an error.
     * 
     * @param resource ID for an XML layout resource to load (e.g.,
     *        <code>R.layout.main_page</code>)
     * @param root Optional view to be the parent of the generated hierarchy (if
     *        <em>attachToRoot</em> is true), or else simply an object that
     *        provides a set of LayoutParams values for root of the returned
     *        hierarchy (if <em>attachToRoot</em> is false.)
     * @param attachToRoot Whether the inflated hierarchy should be attached to
     *        the root parameter? If false, root is only used to create the
     *        correct subclass of LayoutParams for the root view in the XML.
     * @return The root View of the inflated hierarchy. If root was supplied and
     *         attachToRoot is true, this is root; otherwise it is the root of
     *         the inflated XML file.
     */
    public View inflate(@LayoutRes int resource, @Nullable ViewGroup root, boolean attachToRoot)
```

第一个参数：int resource，表示需要加载布局文件的id；

第二个参数：ViewGroup root，表示需要附加到resource资源文件的根控件。说明：调用inflate方法后会得到一个View对象，root参数就是接收该 View对象的**容器**；

第三个参数：boolean attachToRoot， 表示是否把inflate得到的View对象添加到root中，该参数为false时，表示不直接添加到root中；该参数为true时，表示直接添加到root中；

1. 如果第二个参数**root**不为空，并且第三个参数**attachToRoot**为true，则该方法表示，将第一个参数所指定的布局添加到root中。
2. 如果root不为空，attachToRoot为false，则root会协助布局文件的根节点生成布局参数。
3. 如果root为空，不论attachToRoot为什么值，布局文件的根节点的布局参数失效。


参考：

http://blog.csdn.net/jamesli6/article/details/52237780

http://blog.csdn.net/u012702547/article/details/52628453