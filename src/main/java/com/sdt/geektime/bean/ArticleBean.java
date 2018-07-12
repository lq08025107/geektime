package com.sdt.geektime.bean;

import java.util.List;

public class ArticleBean {

    /**
     * error : []
     * data : {"article_subtitle":"无","column_had_sub":true,"audio_title":"081-0708 程序员练级攻略 分布式架构入门 改 1","view_count":3169,"video_cover":"","audio_download_url":"https://res001.geekbang.org/resource/audio/37/eb/37043620aea394d126cb1bc07d9117eb.mp3","audio_time":"00:13:22","video_media":"","article_content":"<p>学习分布式系统跟学习其它技术非常不一样，分布式系统涵盖的面非常广，具体来说涵盖如下几方面：<\/p>\n<ul>\n<li>\n<p><strong>服务调度<\/strong>，涉及服务发现、配置管理、弹性伸缩、故障恢复等。<\/p>\n<\/li>\n<li>\n<p><strong>资源调度<\/strong>，涉及对底层资源的调度使用，如计算资源、网络资源和存储资源等。<\/p>\n<\/li>\n<li>\n<p><strong>流量调度<\/strong>，涉及路由、负载均衡、流控、熔断等。<\/p>\n<\/li>\n<li>\n<p><strong>数据调度<\/strong>，涉及数据复本、数据一致性、分布式事务、分库、分表等。<\/p>\n<\/li>\n<li>\n<p><strong>容错处理<\/strong>，涉及隔离、幂等、重试、业务补偿、异步、降级等。<\/p>\n<\/li>\n<li>\n<p><strong>自动化运维<\/strong>，涉及持续集成、持续部署、全栈监控、调用链跟踪等。<\/p>\n<\/li>\n<\/ul>\n<p>所有这些形成了分布式架构的整体复杂度，也造就了分布式系统中的很多很多论文、图书以及很多很多的项目。要学好分布式系统及其架构，我们需要大量的时间和实践才能真正掌握这些技术。<\/p>\n<p>这里有几点需要你注意一下。<\/p>\n<ul>\n<li>\n<p><strong>分布式系统之所以复杂，就是因为其太容易也太经常出错了<\/strong>。这意味着，<strong>你要把处理错误的代码当成正常功能的代码来处理<\/strong>。<\/p>\n<\/li>\n<li>\n<p><strong>开发一个健壮的分布式系统的成本是单体系统的几百倍甚至几万倍<\/strong>。这意味着，<strong>我们要自己开发一个，需要能力很强的开发人员<\/strong>。<\/p>\n<\/li>\n<li>\n<p><strong>非常健壮的开源的分布式系统并不多，或者说基本没有<\/strong>。这意味着，<strong>如果你要用开源的，那么你需要hold得住其源码<\/strong>。<\/p>\n<\/li>\n<li>\n<p><strong>管理或是协调多个服务或机器是非常难的<\/strong>。这意味着，<strong>我们要去读很多很多的分布式系统的论文<\/strong>。<\/p>\n<\/li>\n<li>\n<p><strong>在分布式环境下，出了问题是很难debug的<\/strong>。这意味着，<strong>我们需要非常好的监控和跟踪系统，还需要经常做演练和测试<\/strong>。<\/p>\n<\/li>\n<li>\n<p><strong>在分布式环境下，你需要更科学地分析和统计<\/strong>。这意味着，<strong>我们要用P90这样的统计指标，而不是平均值，我们还需要做容量计划和评估<\/strong>。<\/p>\n<\/li>\n<li>\n<p><strong>在分布式环境下，需要应用服务化<\/strong>。这意味着，<strong>我们需要一个服务开发框架，比如SOA或微服务<\/strong>。<\/p>\n<\/li>\n<li>\n<p><strong>在分布式环境下，故障不可怕，可怕的是影响面过大，时间过长<\/strong>。这意味着，<strong>我们需要花时间来开发我们的自动化运维平台<\/strong>。<\/p>\n<\/li>\n<\/ul><!-- [[[read_end]]] -->\n<p>总之，在分布式环境下，一切都变得非常复杂。要进入这个领域，你需要有足够多的耐性和足够强的心态来接受各式各样的失败。当拥有丰富的实践和经验后，你才会有所建树。这并不是一日之功，你可能要在这个领域花费数年甚至数十年的时间。<\/p>\n<h1>分布式架构入门<\/h1>\n<p>学习如何设计可扩展的架构将会有助于你成为一个更好的工程师。系统设计是一个很宽泛的话题。在互联网上，关于架构设计原则的资源也是多如牛毛。所以，你需要知道一些基本概念，对此，这里你先读一下下面两篇文章，都非常不错。<\/p>\n<ul>\n<li>\n<p><a href=\"http://www.aosabook.org/en/distsys.html\">Scalable Web Architecture and Distributed Systems<\/a> ，这篇文章会给你一个大概的分布式架构是怎么来解决系统扩展性问题的粗略方法。<\/p>\n<\/li>\n<li>\n<p><a href=\"http://www.slideshare.net/jboner/scalability-availability-stability-patterns\">Scalability, Availability &amp; Stability Patterns<\/a> ，这个PPT能在扩展性、可用性、稳定性等方面给你一个非常大的架构设计视野和思想，可以让你感受一下大概的全景图。<\/p>\n<\/li>\n<\/ul>\n<p>然后，我更强烈推荐GitHub上的一篇文档 - <a href=\"https://github.com/donnemartin/system-design-primer\">System Design Primer<\/a> ，这个仓库主要组织收集分布式系统的一些与扩展性相关的资源，它可以帮助你学习如何构建可扩展的架构。<\/p>\n<p>目前这个仓库收集到了好些系统架构和设计的基本方法。其中包括：CAP理论、一致性模型、可用性模式、DNS、CDN、负载均衡、反向代理、应用层的微服务和服务发现、关系型数据库和NoSQL、缓存、异步通讯、安全等。<\/p>\n<p>我认为，上面这几篇文章基本足够可以让你入门了，因为其中基本涵盖了所有与系统架构相关的技术。这些技术，足够这世上90%以上的公司用了，只有超级巨型的公司才有可能使用更高层次的技术。<\/p>\n<h1>分布式理论<\/h1>\n<p>下面，我们来学习一下分布式方面的理论知识。<\/p>\n<p>首先，你需要看一下 <a href=\"https://github.com/aphyr/distsys-class\">An introduction to distributed systems<\/a>。 这只是某个教学课程的提纲，我觉得还是很不错的，几乎涵盖了分布式系统方面的所有知识点，而且辅以简洁并切中要害的说明文字，非常适合初学者提纲挈领地了解知识全貌，快速与现有知识结合，形成知识体系。这也是一个分布式系统的知识图谱，可以让你看到分布式系统的整体全貌。你可以根据这个知识图Google下去，然后你会学会所有的东西。<\/p>\n<p>然后，你需要了解一下拜占庭将军问题（<a href=\"https://en.wikipedia.org/wiki/Byzantine_fault_tolerance\">Byzantine Generals Problem<\/a>）。这个问题是莱斯利·兰波特（Leslie Lamport）于1982年提出用来解释一致性问题的一个虚构模型（<a href=\"https://www.microsoft.com/en-us/research/uploads/prod/2016/12/The-Byzantine-Generals-Problem.pdf\">论文地址<\/a>）。拜占庭是古代东罗马帝国的首都，由于地域宽广，守卫边境的多个将军（系统中的多个节点）需要通过信使来传递消息，达成某些一致的决定。但由于将军中可能存在叛徒（系统中节点出错），这些叛徒将努力向不同的将军发送不同的消息，试图会干扰一致性的达成。拜占庭问题即为在此情况下，如何让忠诚的将军们能达成行动的一致。<\/p>\n<p>对于拜占庭问题来说，假如节点总数为 <code>N<\/code>，叛变将军数为 <code>F<\/code>，则当 <code>N &gt;= 3F + 1<\/code> 时，问题才有解，即拜占庭容错（Byzantine Fault Tolerant，BFT）算法。拜占庭容错算法解决的是，网络通信可靠但节点可能故障情况下一致性该如何达成的问题。<\/p>\n<p>最早由卡斯特罗（Castro）和利斯科夫（Liskov）在1999年提出的实用拜占庭容错（Practical Byzantine Fault Tolerant，PBFT）算法，是第一个得到广泛应用的BFT算法。只要系统中有2/3的节点是正常工作的，则可以保证一致性。PBFT算法包括三个阶段来达成共识：预准备（Pre-Prepare）、准备（Prepare）和提交（Commit）。<\/p>\n<p>这里有几篇和这个问题相关的文章，推荐阅读。<\/p>\n<ul>\n<li>\n<p><a href=\"http://www.drdobbs.com/cpp/the-byzantine-generals-problem/206904396\">Dr.Dobb\u2019s - The Byzantine Generals Problem<\/a><\/p>\n<\/li>\n<li>\n<p><a href=\"http://blog.jameslarisch.com/the-byzantine-generals-problem\">The Byzantine Generals Problem<\/a><\/p>\n<\/li>\n<li>\n<p><a href=\"http://pmg.csail.mit.edu/papers/osdi99.pdf\">Practicle Byzantine Fault Tolerance<\/a><\/p>\n<\/li>\n<\/ul>\n<p>拜占庭容错系统研究中有三个重要理论：CAP、FLP和DLS。<\/p>\n<ul>\n<li>\n<p><a href=\"https://en.wikipedia.org/wiki/CAP_theorem\">CAP定理<\/a>，CAP理论相信你应该听说过不下N次了。CAP定理是分布式系统设计中最基础也是最为关键的理论。CAP定理指出，分布式数据存储不可能同时满足以下三个条件：一致性（Consistency）、可用性（Availability）和 分区容忍（Partition tolerance）。 \u201c在网络发生阻断（partition）时，你只能选择数据的一致性（consistency）或可用性（availability），无法两者兼得\u201d。<\/p>\n<p>论点比较直观：如果网络因阻断而分隔为二，在其中一边我送出一笔交易：\u201c将我的十元给A\u201d；在另一半我送出另一笔交易：&quot;将我的十元给B &quot;。此时系统要不是，a）无可用性，即这两笔交易至少会有一笔交易不会被接受；要不就是，b）无一致性，一半看到的是A多了十元而另一半则看到B多了十元。要注意的是，CAP理论和扩展性（scalability）是无关的，在分片（sharded）或非分片的系统皆适用。<\/p>\n<\/li>\n<li>\n<p><a href=\"http://the-paper-trail.org/blog/a-brief-tour-of-flp-impossibility/\">FLP impossibility<\/a>-在异步环境中，如果节点间的网络延迟没有上限，只要有一个恶意的节点存在，就没有算法能在有限的时间内达成共识。但值得注意的是， <a href=\"https://en.wikipedia.org/wiki/Las_Vegas_algorithm\">\u201cLas Vegas\u201d algorithms<\/a>（这个算法又叫撞大运算法，其保证结果正确，只是在运算时所用资源上进行赌博，一个简单的例子是随机快速排序，它的pivot是随机选的，但排序结果永远一致）在每一轮皆有一定机率达成共识，随着时间增加，机率会越趋近于1。而这也是许多成功的共识算法会采用的解决问题的办法。<\/p>\n<\/li>\n<li>\n<p>容错的上限-由 <a href=\"http://groups.csail.mit.edu/tds/papers/Lynch/jacm88.pdf\">DLS论文<\/a> ，我们可以得到以下结论。<\/p>\n<ul>\n<li>\n<p>在部分同步（partially synchronous）的网络环境中（即网络延迟有一定的上限，但我们无法事先知道上限是多少），协议可以容忍最多1/3的拜占庭故障（Byzantine fault）。<\/p>\n<\/li>\n<li>\n<p>在异步（asynchronous）的网络环境中，具有确定性质的协议无法容忍任何错误，但这篇论文并没有提及 <a href=\"http://link.springer.com/chapter/10.1007%2F978-3-540-77444-0_7\">randomized algorithms<\/a>，在这种情况下可以容忍最多1/3的拜占庭故障。<\/p>\n<\/li>\n<li>\n<p>在同步（synchronous）网络环境中（即网络延迟有上限且上限是已知的），协议可以容忍100%的拜占庭故障，但当超过1/2的节点为恶意节点时，会有一些限制条件。要注意的是，我们考虑的是&quot;具有认证特性的拜占庭模型（authenticated Byzantine）&quot;，而不是&quot;一般的拜占庭模型&quot;；具有认证特性指的是将如今已经过大量研究且成本低廉的公私钥加密机制应用在我们的算法中。<\/p>\n<\/li>\n<\/ul>\n<\/li>\n<\/ul>\n<p>当然，还有一个著名的\u201c8条荒谬的分布式假设（<a href=\"http://en.wikipedia.org/wiki/Fallacies_of_distributed_computing\">Fallacies of Distributed Computing<\/a>）\u201d。<\/p>\n<ol>\n<li>网络是稳定的。<\/li>\n<li>网络传输的延迟是零。<\/li>\n<li>网络的带宽是无穷大。<\/li>\n<li>网络是安全的。<\/li>\n<li>网络的拓扑不会改变。<\/li>\n<li>只有一个系统管理员。<\/li>\n<li>传输数据的成本为零。<\/li>\n<li>整个网络是同构的。<\/li>\n<\/ol>\n<p>阿尔农·罗特姆-盖尔-奥兹（Arnon Rotem-Gal-Oz）写了一篇长文 <a href=\"http://www.rgoarchitects.com/Files/fallacies.pdf\">Fallacies of Distributed Computing Explained<\/a> 来解释为什么这些观点是错误的。另外，<a href=\"http://blog.fogcreek.com/eight-fallacies-of-distributed-computing-tech-talk/\">加勒思·威尔逊（Gareth Wilson）的文章<\/a> 则用日常生活中的例子，对这些点做了通俗的解释。为什么我们深刻地认识到这8个错误？是因为，这要我们清楚地认识到\u2014\u2014在分布式系统中错误是不可能避免的，我们在分布式系统中，能做的不是避免错误，而是要把错误的处理当成功能写在代码中。<\/p>\n<p>下面分享几篇一致性方面的论文。<\/p>\n<ul>\n<li>\n<p>当然，关于经典的CAP理论，也存在一些误导的地方，这个问题在2012年有一篇论文 <a href=\"https://www.infoq.com/articles/cap-twelve-years-later-how-the-rules-have-changed\">CAP Twelve Years Later: How the Rules Have Changed<\/a> （<a href=\"http://www.infoq.com/cn/articles/cap-twelve-years-later-how-the-rules-have-changed\">中译版<\/a>）中做了一些讨论，主要是说，在CAP中最大的问题就是分区，也就是P，在P发生的情况下，非常难以保证C和A。然而，这是强一致性的情况。<\/p>\n<p>其实，在很多时候，我们并不需要强一致性的系统，所以后来，人们争论关于数据一致性和可用性时，主要是集中在强一致性的ACID或最终一致性的BASE。当时，BASE还不怎么为世人所接受，主要是大家都觉得ACID是最完美的模型，大家很难接受不完美的BASE。在CAP理论中，大家总是觉得需要&quot;三选二&quot;，也就是说，P是必选项，那&quot;三选二&quot;的选择题不就变成数据一致性(consistency)、服务可用性(availability) 间的&quot;二选一&quot; ？<\/p>\n<p>然而，现实却是，P很少遇到，而C和A这两个事，工程实践中一致性有不同程度，可用性也有不同等级，在保证分区容错性的前提下，放宽约束后可以兼顾一致性和可用性，两者不是非此即彼。其实，在一个时间可能允许的范围内是可以取舍并交替选择的。<\/p>\n<\/li>\n<li>\n<p><a href=\"https://pdfs.semanticscholar.org/5015/8bc1a8a67295ab7bce0550886a9859000dc2.pdf\">Harvest, Yield, and Scalable Tolerant Systems<\/a> ，这篇论文是基于上面那篇&quot;CAP 12年后&quot;的论文写的，它主要提出了Harvest和Yield概念，并把上面那篇论文中所讨论的东西讲得更为仔细了一些。<\/p>\n<\/li>\n<li>\n<p><a href=\"https://queue.acm.org/detail.cfm?id=1394128\">Base: An Acid Alternative<\/a> （<a href=\"http://www.cnblogs.com/savorboard/p/base-an-acid-alternative.html\">中译版<\/a>），本文是eBay的架构师在2008年发表给ACM的文章，是一篇解释BASE原则，或者说最终一致性的经典文章。文中讨论了BASE与ACID原则的基本差异, 以及如何设计大型网站以满足不断增长的可伸缩性需求，其中有如何对业务做调整和折中，以及一些具体的折中技术的介绍。一个比较经典的话是\u2014\u2014\u201c在对数据库进行分区后,为了可用性（Availability）牺牲部分一致性（Consistency）可以显著地提升系统的可伸缩性(Scalability)\u201d。<\/p>\n<\/li>\n<li>\n<p><a href=\"https://www.allthingsdistributed.com/2008/12/eventually_consistent.html\">Eventually Consistent<\/a> ，这篇文章是AWS的CTO维尔纳·沃格尔（Werner Vogel）在2008年发布在ACM Queue上的一篇数据库方面的重要文章，阐述了NoSQL数据库的理论基石\u2014\u2014最终一致性，对传统的关系型数据库（ACID，Transaction）做了较好的补充。<\/p>\n<\/li>\n<\/ul>\n<h1>小结<\/h1>\n<p>好了，总结一下今天分享的内容。文章的开头，我给出了学习分布式架构需要注意的几个关键点，然后列出了入门学习的资源，基本涵盖了所有与系统架构相关的技术。随后讲述了拜占庭容错系统研究中有三个重要理论：CAP、FLP和DLS，以及8条荒谬的分布式假设，从理论和认知等角度让你更为清楚地理解分布式系统。最后分享了几篇一致性相关的论文，很实用很经典，推荐阅读。<\/p>\n<p>下篇文章中，我将推荐一些分布式架构的经典图书和论文，并给出了导读文字，几乎涵盖了分布式系统架构方面的所有关键的理论知识。敬请期待。<\/p>\n<p>下面是《程序员练级攻略（2018）》系列文章的目录（持续更新中）。<\/p>\n<ul>\n<li><a href=\"https://time.geekbang.org/column/article/8136\">开篇词<\/a><\/li>\n<li>入门篇\n<ul>\n<li><a href=\"https://time.geekbang.org/column/article/8216\">零基础启蒙<\/a><\/li>\n<li><a href=\"https://time.geekbang.org/column/article/8217\">正式入门<\/a><\/li>\n<\/ul>\n<\/li>\n<li>修养篇\n<ul>\n<li><a href=\"https://time.geekbang.org/column/article/8700\">程序员修养<\/a><\/li>\n<\/ul>\n<\/li>\n<li>专业基础篇\n<ul>\n<li><a href=\"https://time.geekbang.org/column/article/8701\">编程语言<\/a><\/li>\n<li><a href=\"https://time.geekbang.org/column/article/8887\">理论学科<\/a><\/li>\n<li><a href=\"https://time.geekbang.org/column/article/8888\">系统知识<\/a><\/li>\n<\/ul>\n<\/li>\n<li>软件设计篇\n<ul>\n<li><a href=\"https://time.geekbang.org/column/article/9369\">软件设计<\/a><\/li>\n<\/ul>\n<\/li>\n<li>高手成长篇\n<ul>\n<li><a href=\"https://time.geekbang.org/column/article/9759\">Linux系统、内存和网络（系统底层知识）<\/a><\/li>\n<li><a href=\"https://time.geekbang.org/column/article/9851\">异步I/O模型和Lock-Free编程（系统底层知识）<\/a><\/li>\n<li><a href=\"https://time.geekbang.org/column/article/10216\">Java底层知识<\/a><\/li>\n<li><a href=\"https://time.geekbang.org/column/article/10301\">数据库<\/a><\/li>\n<li><a href=\"https://time.geekbang.org/column/article/10603\">分布式架构入门（分布式架构）<\/a><\/li>\n<li>分布式架构经典图书和论文（分布式架构）<\/li>\n<li>\u2026\u2026<\/li>\n<\/ul>\n<\/li>\n<\/ul>\n<p><img src=\"https://static001.geekbang.org/resource/image/9e/cd/9e00f2d01bc172e791e6e39b9de2a2cd.jpg\" alt=\"\" /><\/p>\n","like_count":73,"video_height":0,"article_title":"程序员练级攻略（2018）：分布式架构入门","audio_size":6420766,"article_sharetitle":"左耳朵耗子|程序员练级攻略（2018）：分布式架构入门","author_name":"陈皓","article_ctime":1531177200,"id":10603,"article_cover":"https://static001.geekbang.org/resource/image/6f/0f/6f1dd3c2bc829affb8e3fa529a35ce0f.jpg","audio_url":"https://res001.geekbang.org/media/audio/37/eb/37043620aea394d126cb1bc07d9117eb/ld/ld.m3u8","video_size":0,"chapter_id":"0","column_is_experience":false,"had_liked":false,"audio_time_arr":{"m":"13","s":"22","h":"00"},"had_viewed":true,"column_bgcolor":"#6091b2","video_time":"","column_cover":"https://static001.geekbang.org/resource/image/7b/b8/7bb9873b954ff331ffb8b73d8d3b02b8.jpg","audio_md5":"37043620aea394d126cb1bc07d9117eb","article_poster_wxlite":"https://static001.geekbang.org/render/screen/83/9b/83343a5de0cb288e47944d50a6423f9b.jpeg","article_cover_hidden":false,"cid":48,"article_could_preview":false,"article_summary":"本文中推荐的资料基本涵盖了所有与系统架构相关的技术，足够这世上90%以上的公司用了，只有超级巨型的公司才有可能使用更高层次的技术。","video_width":0,"audio_dubber":"柴巍","column_id":48}
     * code : 0
     * extra : []
     */

    private DataBean data;
    private int code;
    private List<?> error;
    private List<?> extra;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<?> getError() {
        return error;
    }

    public void setError(List<?> error) {
        this.error = error;
    }

    public List<?> getExtra() {
        return extra;
    }

    public void setExtra(List<?> extra) {
        this.extra = extra;
    }

    public static class DataBean {
        /**
         * article_subtitle : 无
         * column_had_sub : true
         * audio_title : 081-0708 程序员练级攻略 分布式架构入门 改 1
         * view_count : 3169
         * video_cover :
         * audio_download_url : https://res001.geekbang.org/resource/audio/37/eb/37043620aea394d126cb1bc07d9117eb.mp3
         * audio_time : 00:13:22
         * video_media :
         * article_content : <p>学习分布式系统跟学习其它技术非常不一样，分布式系统涵盖的面非常广，具体来说涵盖如下几方面：</p>
         <ul>
         <li>
         <p><strong>服务调度</strong>，涉及服务发现、配置管理、弹性伸缩、故障恢复等。</p>
         </li>
         <li>
         <p><strong>资源调度</strong>，涉及对底层资源的调度使用，如计算资源、网络资源和存储资源等。</p>
         </li>
         <li>
         <p><strong>流量调度</strong>，涉及路由、负载均衡、流控、熔断等。</p>
         </li>
         <li>
         <p><strong>数据调度</strong>，涉及数据复本、数据一致性、分布式事务、分库、分表等。</p>
         </li>
         <li>
         <p><strong>容错处理</strong>，涉及隔离、幂等、重试、业务补偿、异步、降级等。</p>
         </li>
         <li>
         <p><strong>自动化运维</strong>，涉及持续集成、持续部署、全栈监控、调用链跟踪等。</p>
         </li>
         </ul>
         <p>所有这些形成了分布式架构的整体复杂度，也造就了分布式系统中的很多很多论文、图书以及很多很多的项目。要学好分布式系统及其架构，我们需要大量的时间和实践才能真正掌握这些技术。</p>
         <p>这里有几点需要你注意一下。</p>
         <ul>
         <li>
         <p><strong>分布式系统之所以复杂，就是因为其太容易也太经常出错了</strong>。这意味着，<strong>你要把处理错误的代码当成正常功能的代码来处理</strong>。</p>
         </li>
         <li>
         <p><strong>开发一个健壮的分布式系统的成本是单体系统的几百倍甚至几万倍</strong>。这意味着，<strong>我们要自己开发一个，需要能力很强的开发人员</strong>。</p>
         </li>
         <li>
         <p><strong>非常健壮的开源的分布式系统并不多，或者说基本没有</strong>。这意味着，<strong>如果你要用开源的，那么你需要hold得住其源码</strong>。</p>
         </li>
         <li>
         <p><strong>管理或是协调多个服务或机器是非常难的</strong>。这意味着，<strong>我们要去读很多很多的分布式系统的论文</strong>。</p>
         </li>
         <li>
         <p><strong>在分布式环境下，出了问题是很难debug的</strong>。这意味着，<strong>我们需要非常好的监控和跟踪系统，还需要经常做演练和测试</strong>。</p>
         </li>
         <li>
         <p><strong>在分布式环境下，你需要更科学地分析和统计</strong>。这意味着，<strong>我们要用P90这样的统计指标，而不是平均值，我们还需要做容量计划和评估</strong>。</p>
         </li>
         <li>
         <p><strong>在分布式环境下，需要应用服务化</strong>。这意味着，<strong>我们需要一个服务开发框架，比如SOA或微服务</strong>。</p>
         </li>
         <li>
         <p><strong>在分布式环境下，故障不可怕，可怕的是影响面过大，时间过长</strong>。这意味着，<strong>我们需要花时间来开发我们的自动化运维平台</strong>。</p>
         </li>
         </ul><!-- [[[read_end]]] -->
         <p>总之，在分布式环境下，一切都变得非常复杂。要进入这个领域，你需要有足够多的耐性和足够强的心态来接受各式各样的失败。当拥有丰富的实践和经验后，你才会有所建树。这并不是一日之功，你可能要在这个领域花费数年甚至数十年的时间。</p>
         <h1>分布式架构入门</h1>
         <p>学习如何设计可扩展的架构将会有助于你成为一个更好的工程师。系统设计是一个很宽泛的话题。在互联网上，关于架构设计原则的资源也是多如牛毛。所以，你需要知道一些基本概念，对此，这里你先读一下下面两篇文章，都非常不错。</p>
         <ul>
         <li>
         <p><a href="http://www.aosabook.org/en/distsys.html">Scalable Web Architecture and Distributed Systems</a> ，这篇文章会给你一个大概的分布式架构是怎么来解决系统扩展性问题的粗略方法。</p>
         </li>
         <li>
         <p><a href="http://www.slideshare.net/jboner/scalability-availability-stability-patterns">Scalability, Availability &amp; Stability Patterns</a> ，这个PPT能在扩展性、可用性、稳定性等方面给你一个非常大的架构设计视野和思想，可以让你感受一下大概的全景图。</p>
         </li>
         </ul>
         <p>然后，我更强烈推荐GitHub上的一篇文档 - <a href="https://github.com/donnemartin/system-design-primer">System Design Primer</a> ，这个仓库主要组织收集分布式系统的一些与扩展性相关的资源，它可以帮助你学习如何构建可扩展的架构。</p>
         <p>目前这个仓库收集到了好些系统架构和设计的基本方法。其中包括：CAP理论、一致性模型、可用性模式、DNS、CDN、负载均衡、反向代理、应用层的微服务和服务发现、关系型数据库和NoSQL、缓存、异步通讯、安全等。</p>
         <p>我认为，上面这几篇文章基本足够可以让你入门了，因为其中基本涵盖了所有与系统架构相关的技术。这些技术，足够这世上90%以上的公司用了，只有超级巨型的公司才有可能使用更高层次的技术。</p>
         <h1>分布式理论</h1>
         <p>下面，我们来学习一下分布式方面的理论知识。</p>
         <p>首先，你需要看一下 <a href="https://github.com/aphyr/distsys-class">An introduction to distributed systems</a>。 这只是某个教学课程的提纲，我觉得还是很不错的，几乎涵盖了分布式系统方面的所有知识点，而且辅以简洁并切中要害的说明文字，非常适合初学者提纲挈领地了解知识全貌，快速与现有知识结合，形成知识体系。这也是一个分布式系统的知识图谱，可以让你看到分布式系统的整体全貌。你可以根据这个知识图Google下去，然后你会学会所有的东西。</p>
         <p>然后，你需要了解一下拜占庭将军问题（<a href="https://en.wikipedia.org/wiki/Byzantine_fault_tolerance">Byzantine Generals Problem</a>）。这个问题是莱斯利·兰波特（Leslie Lamport）于1982年提出用来解释一致性问题的一个虚构模型（<a href="https://www.microsoft.com/en-us/research/uploads/prod/2016/12/The-Byzantine-Generals-Problem.pdf">论文地址</a>）。拜占庭是古代东罗马帝国的首都，由于地域宽广，守卫边境的多个将军（系统中的多个节点）需要通过信使来传递消息，达成某些一致的决定。但由于将军中可能存在叛徒（系统中节点出错），这些叛徒将努力向不同的将军发送不同的消息，试图会干扰一致性的达成。拜占庭问题即为在此情况下，如何让忠诚的将军们能达成行动的一致。</p>
         <p>对于拜占庭问题来说，假如节点总数为 <code>N</code>，叛变将军数为 <code>F</code>，则当 <code>N &gt;= 3F + 1</code> 时，问题才有解，即拜占庭容错（Byzantine Fault Tolerant，BFT）算法。拜占庭容错算法解决的是，网络通信可靠但节点可能故障情况下一致性该如何达成的问题。</p>
         <p>最早由卡斯特罗（Castro）和利斯科夫（Liskov）在1999年提出的实用拜占庭容错（Practical Byzantine Fault Tolerant，PBFT）算法，是第一个得到广泛应用的BFT算法。只要系统中有2/3的节点是正常工作的，则可以保证一致性。PBFT算法包括三个阶段来达成共识：预准备（Pre-Prepare）、准备（Prepare）和提交（Commit）。</p>
         <p>这里有几篇和这个问题相关的文章，推荐阅读。</p>
         <ul>
         <li>
         <p><a href="http://www.drdobbs.com/cpp/the-byzantine-generals-problem/206904396">Dr.Dobb’s - The Byzantine Generals Problem</a></p>
         </li>
         <li>
         <p><a href="http://blog.jameslarisch.com/the-byzantine-generals-problem">The Byzantine Generals Problem</a></p>
         </li>
         <li>
         <p><a href="http://pmg.csail.mit.edu/papers/osdi99.pdf">Practicle Byzantine Fault Tolerance</a></p>
         </li>
         </ul>
         <p>拜占庭容错系统研究中有三个重要理论：CAP、FLP和DLS。</p>
         <ul>
         <li>
         <p><a href="https://en.wikipedia.org/wiki/CAP_theorem">CAP定理</a>，CAP理论相信你应该听说过不下N次了。CAP定理是分布式系统设计中最基础也是最为关键的理论。CAP定理指出，分布式数据存储不可能同时满足以下三个条件：一致性（Consistency）、可用性（Availability）和 分区容忍（Partition tolerance）。 “在网络发生阻断（partition）时，你只能选择数据的一致性（consistency）或可用性（availability），无法两者兼得”。</p>
         <p>论点比较直观：如果网络因阻断而分隔为二，在其中一边我送出一笔交易：“将我的十元给A”；在另一半我送出另一笔交易：&quot;将我的十元给B &quot;。此时系统要不是，a）无可用性，即这两笔交易至少会有一笔交易不会被接受；要不就是，b）无一致性，一半看到的是A多了十元而另一半则看到B多了十元。要注意的是，CAP理论和扩展性（scalability）是无关的，在分片（sharded）或非分片的系统皆适用。</p>
         </li>
         <li>
         <p><a href="http://the-paper-trail.org/blog/a-brief-tour-of-flp-impossibility/">FLP impossibility</a>-在异步环境中，如果节点间的网络延迟没有上限，只要有一个恶意的节点存在，就没有算法能在有限的时间内达成共识。但值得注意的是， <a href="https://en.wikipedia.org/wiki/Las_Vegas_algorithm">“Las Vegas” algorithms</a>（这个算法又叫撞大运算法，其保证结果正确，只是在运算时所用资源上进行赌博，一个简单的例子是随机快速排序，它的pivot是随机选的，但排序结果永远一致）在每一轮皆有一定机率达成共识，随着时间增加，机率会越趋近于1。而这也是许多成功的共识算法会采用的解决问题的办法。</p>
         </li>
         <li>
         <p>容错的上限-由 <a href="http://groups.csail.mit.edu/tds/papers/Lynch/jacm88.pdf">DLS论文</a> ，我们可以得到以下结论。</p>
         <ul>
         <li>
         <p>在部分同步（partially synchronous）的网络环境中（即网络延迟有一定的上限，但我们无法事先知道上限是多少），协议可以容忍最多1/3的拜占庭故障（Byzantine fault）。</p>
         </li>
         <li>
         <p>在异步（asynchronous）的网络环境中，具有确定性质的协议无法容忍任何错误，但这篇论文并没有提及 <a href="http://link.springer.com/chapter/10.1007%2F978-3-540-77444-0_7">randomized algorithms</a>，在这种情况下可以容忍最多1/3的拜占庭故障。</p>
         </li>
         <li>
         <p>在同步（synchronous）网络环境中（即网络延迟有上限且上限是已知的），协议可以容忍100%的拜占庭故障，但当超过1/2的节点为恶意节点时，会有一些限制条件。要注意的是，我们考虑的是&quot;具有认证特性的拜占庭模型（authenticated Byzantine）&quot;，而不是&quot;一般的拜占庭模型&quot;；具有认证特性指的是将如今已经过大量研究且成本低廉的公私钥加密机制应用在我们的算法中。</p>
         </li>
         </ul>
         </li>
         </ul>
         <p>当然，还有一个著名的“8条荒谬的分布式假设（<a href="http://en.wikipedia.org/wiki/Fallacies_of_distributed_computing">Fallacies of Distributed Computing</a>）”。</p>
         <ol>
         <li>网络是稳定的。</li>
         <li>网络传输的延迟是零。</li>
         <li>网络的带宽是无穷大。</li>
         <li>网络是安全的。</li>
         <li>网络的拓扑不会改变。</li>
         <li>只有一个系统管理员。</li>
         <li>传输数据的成本为零。</li>
         <li>整个网络是同构的。</li>
         </ol>
         <p>阿尔农·罗特姆-盖尔-奥兹（Arnon Rotem-Gal-Oz）写了一篇长文 <a href="http://www.rgoarchitects.com/Files/fallacies.pdf">Fallacies of Distributed Computing Explained</a> 来解释为什么这些观点是错误的。另外，<a href="http://blog.fogcreek.com/eight-fallacies-of-distributed-computing-tech-talk/">加勒思·威尔逊（Gareth Wilson）的文章</a> 则用日常生活中的例子，对这些点做了通俗的解释。为什么我们深刻地认识到这8个错误？是因为，这要我们清楚地认识到——在分布式系统中错误是不可能避免的，我们在分布式系统中，能做的不是避免错误，而是要把错误的处理当成功能写在代码中。</p>
         <p>下面分享几篇一致性方面的论文。</p>
         <ul>
         <li>
         <p>当然，关于经典的CAP理论，也存在一些误导的地方，这个问题在2012年有一篇论文 <a href="https://www.infoq.com/articles/cap-twelve-years-later-how-the-rules-have-changed">CAP Twelve Years Later: How the Rules Have Changed</a> （<a href="http://www.infoq.com/cn/articles/cap-twelve-years-later-how-the-rules-have-changed">中译版</a>）中做了一些讨论，主要是说，在CAP中最大的问题就是分区，也就是P，在P发生的情况下，非常难以保证C和A。然而，这是强一致性的情况。</p>
         <p>其实，在很多时候，我们并不需要强一致性的系统，所以后来，人们争论关于数据一致性和可用性时，主要是集中在强一致性的ACID或最终一致性的BASE。当时，BASE还不怎么为世人所接受，主要是大家都觉得ACID是最完美的模型，大家很难接受不完美的BASE。在CAP理论中，大家总是觉得需要&quot;三选二&quot;，也就是说，P是必选项，那&quot;三选二&quot;的选择题不就变成数据一致性(consistency)、服务可用性(availability) 间的&quot;二选一&quot; ？</p>
         <p>然而，现实却是，P很少遇到，而C和A这两个事，工程实践中一致性有不同程度，可用性也有不同等级，在保证分区容错性的前提下，放宽约束后可以兼顾一致性和可用性，两者不是非此即彼。其实，在一个时间可能允许的范围内是可以取舍并交替选择的。</p>
         </li>
         <li>
         <p><a href="https://pdfs.semanticscholar.org/5015/8bc1a8a67295ab7bce0550886a9859000dc2.pdf">Harvest, Yield, and Scalable Tolerant Systems</a> ，这篇论文是基于上面那篇&quot;CAP 12年后&quot;的论文写的，它主要提出了Harvest和Yield概念，并把上面那篇论文中所讨论的东西讲得更为仔细了一些。</p>
         </li>
         <li>
         <p><a href="https://queue.acm.org/detail.cfm?id=1394128">Base: An Acid Alternative</a> （<a href="http://www.cnblogs.com/savorboard/p/base-an-acid-alternative.html">中译版</a>），本文是eBay的架构师在2008年发表给ACM的文章，是一篇解释BASE原则，或者说最终一致性的经典文章。文中讨论了BASE与ACID原则的基本差异, 以及如何设计大型网站以满足不断增长的可伸缩性需求，其中有如何对业务做调整和折中，以及一些具体的折中技术的介绍。一个比较经典的话是——“在对数据库进行分区后,为了可用性（Availability）牺牲部分一致性（Consistency）可以显著地提升系统的可伸缩性(Scalability)”。</p>
         </li>
         <li>
         <p><a href="https://www.allthingsdistributed.com/2008/12/eventually_consistent.html">Eventually Consistent</a> ，这篇文章是AWS的CTO维尔纳·沃格尔（Werner Vogel）在2008年发布在ACM Queue上的一篇数据库方面的重要文章，阐述了NoSQL数据库的理论基石——最终一致性，对传统的关系型数据库（ACID，Transaction）做了较好的补充。</p>
         </li>
         </ul>
         <h1>小结</h1>
         <p>好了，总结一下今天分享的内容。文章的开头，我给出了学习分布式架构需要注意的几个关键点，然后列出了入门学习的资源，基本涵盖了所有与系统架构相关的技术。随后讲述了拜占庭容错系统研究中有三个重要理论：CAP、FLP和DLS，以及8条荒谬的分布式假设，从理论和认知等角度让你更为清楚地理解分布式系统。最后分享了几篇一致性相关的论文，很实用很经典，推荐阅读。</p>
         <p>下篇文章中，我将推荐一些分布式架构的经典图书和论文，并给出了导读文字，几乎涵盖了分布式系统架构方面的所有关键的理论知识。敬请期待。</p>
         <p>下面是《程序员练级攻略（2018）》系列文章的目录（持续更新中）。</p>
         <ul>
         <li><a href="https://time.geekbang.org/column/article/8136">开篇词</a></li>
         <li>入门篇
         <ul>
         <li><a href="https://time.geekbang.org/column/article/8216">零基础启蒙</a></li>
         <li><a href="https://time.geekbang.org/column/article/8217">正式入门</a></li>
         </ul>
         </li>
         <li>修养篇
         <ul>
         <li><a href="https://time.geekbang.org/column/article/8700">程序员修养</a></li>
         </ul>
         </li>
         <li>专业基础篇
         <ul>
         <li><a href="https://time.geekbang.org/column/article/8701">编程语言</a></li>
         <li><a href="https://time.geekbang.org/column/article/8887">理论学科</a></li>
         <li><a href="https://time.geekbang.org/column/article/8888">系统知识</a></li>
         </ul>
         </li>
         <li>软件设计篇
         <ul>
         <li><a href="https://time.geekbang.org/column/article/9369">软件设计</a></li>
         </ul>
         </li>
         <li>高手成长篇
         <ul>
         <li><a href="https://time.geekbang.org/column/article/9759">Linux系统、内存和网络（系统底层知识）</a></li>
         <li><a href="https://time.geekbang.org/column/article/9851">异步I/O模型和Lock-Free编程（系统底层知识）</a></li>
         <li><a href="https://time.geekbang.org/column/article/10216">Java底层知识</a></li>
         <li><a href="https://time.geekbang.org/column/article/10301">数据库</a></li>
         <li><a href="https://time.geekbang.org/column/article/10603">分布式架构入门（分布式架构）</a></li>
         <li>分布式架构经典图书和论文（分布式架构）</li>
         <li>……</li>
         </ul>
         </li>
         </ul>
         <p><img src="https://static001.geekbang.org/resource/image/9e/cd/9e00f2d01bc172e791e6e39b9de2a2cd.jpg" alt="" /></p>

         * like_count : 73
         * video_height : 0
         * article_title : 程序员练级攻略（2018）：分布式架构入门
         * audio_size : 6420766
         * article_sharetitle : 左耳朵耗子|程序员练级攻略（2018）：分布式架构入门
         * author_name : 陈皓
         * article_ctime : 1531177200
         * id : 10603
         * article_cover : https://static001.geekbang.org/resource/image/6f/0f/6f1dd3c2bc829affb8e3fa529a35ce0f.jpg
         * audio_url : https://res001.geekbang.org/media/audio/37/eb/37043620aea394d126cb1bc07d9117eb/ld/ld.m3u8
         * video_size : 0
         * chapter_id : 0
         * column_is_experience : false
         * had_liked : false
         * audio_time_arr : {"m":"13","s":"22","h":"00"}
         * had_viewed : true
         * column_bgcolor : #6091b2
         * video_time :
         * column_cover : https://static001.geekbang.org/resource/image/7b/b8/7bb9873b954ff331ffb8b73d8d3b02b8.jpg
         * audio_md5 : 37043620aea394d126cb1bc07d9117eb
         * article_poster_wxlite : https://static001.geekbang.org/render/screen/83/9b/83343a5de0cb288e47944d50a6423f9b.jpeg
         * article_cover_hidden : false
         * cid : 48
         * article_could_preview : false
         * article_summary : 本文中推荐的资料基本涵盖了所有与系统架构相关的技术，足够这世上90%以上的公司用了，只有超级巨型的公司才有可能使用更高层次的技术。
         * video_width : 0
         * audio_dubber : 柴巍
         * column_id : 48
         */

        private String article_subtitle;
        private boolean column_had_sub;
        private String audio_title;
        private int view_count;
        private String video_cover;
        private String audio_download_url;
        private String audio_time;
        private String video_media;
        private String article_content;
        private int like_count;
        private int video_height;
        private String article_title;
        private int audio_size;
        private String article_sharetitle;
        private String author_name;
        private int article_ctime;
        private int id;
        private String article_cover;
        private String audio_url;
        private int video_size;
        private String chapter_id;
        private boolean column_is_experience;
        private boolean had_liked;
        private AudioTimeArrBean audio_time_arr;
        private boolean had_viewed;
        private String column_bgcolor;
        private String video_time;
        private String column_cover;
        private String audio_md5;
        private String article_poster_wxlite;
        private boolean article_cover_hidden;
        private int cid;
        private boolean article_could_preview;
        private String article_summary;
        private int video_width;
        private String audio_dubber;
        private int column_id;

        public String getArticle_subtitle() {
            return article_subtitle;
        }

        public void setArticle_subtitle(String article_subtitle) {
            this.article_subtitle = article_subtitle;
        }

        public boolean isColumn_had_sub() {
            return column_had_sub;
        }

        public void setColumn_had_sub(boolean column_had_sub) {
            this.column_had_sub = column_had_sub;
        }

        public String getAudio_title() {
            return audio_title;
        }

        public void setAudio_title(String audio_title) {
            this.audio_title = audio_title;
        }

        public int getView_count() {
            return view_count;
        }

        public void setView_count(int view_count) {
            this.view_count = view_count;
        }

        public String getVideo_cover() {
            return video_cover;
        }

        public void setVideo_cover(String video_cover) {
            this.video_cover = video_cover;
        }

        public String getAudio_download_url() {
            return audio_download_url;
        }

        public void setAudio_download_url(String audio_download_url) {
            this.audio_download_url = audio_download_url;
        }

        public String getAudio_time() {
            return audio_time;
        }

        public void setAudio_time(String audio_time) {
            this.audio_time = audio_time;
        }

        public String getVideo_media() {
            return video_media;
        }

        public void setVideo_media(String video_media) {
            this.video_media = video_media;
        }

        public String getArticle_content() {
            return article_content;
        }

        public void setArticle_content(String article_content) {
            this.article_content = article_content;
        }

        public int getLike_count() {
            return like_count;
        }

        public void setLike_count(int like_count) {
            this.like_count = like_count;
        }

        public int getVideo_height() {
            return video_height;
        }

        public void setVideo_height(int video_height) {
            this.video_height = video_height;
        }

        public String getArticle_title() {
            return article_title;
        }

        public void setArticle_title(String article_title) {
            this.article_title = article_title;
        }

        public int getAudio_size() {
            return audio_size;
        }

        public void setAudio_size(int audio_size) {
            this.audio_size = audio_size;
        }

        public String getArticle_sharetitle() {
            return article_sharetitle;
        }

        public void setArticle_sharetitle(String article_sharetitle) {
            this.article_sharetitle = article_sharetitle;
        }

        public String getAuthor_name() {
            return author_name;
        }

        public void setAuthor_name(String author_name) {
            this.author_name = author_name;
        }

        public int getArticle_ctime() {
            return article_ctime;
        }

        public void setArticle_ctime(int article_ctime) {
            this.article_ctime = article_ctime;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getArticle_cover() {
            return article_cover;
        }

        public void setArticle_cover(String article_cover) {
            this.article_cover = article_cover;
        }

        public String getAudio_url() {
            return audio_url;
        }

        public void setAudio_url(String audio_url) {
            this.audio_url = audio_url;
        }

        public int getVideo_size() {
            return video_size;
        }

        public void setVideo_size(int video_size) {
            this.video_size = video_size;
        }

        public String getChapter_id() {
            return chapter_id;
        }

        public void setChapter_id(String chapter_id) {
            this.chapter_id = chapter_id;
        }

        public boolean isColumn_is_experience() {
            return column_is_experience;
        }

        public void setColumn_is_experience(boolean column_is_experience) {
            this.column_is_experience = column_is_experience;
        }

        public boolean isHad_liked() {
            return had_liked;
        }

        public void setHad_liked(boolean had_liked) {
            this.had_liked = had_liked;
        }

        public AudioTimeArrBean getAudio_time_arr() {
            return audio_time_arr;
        }

        public void setAudio_time_arr(AudioTimeArrBean audio_time_arr) {
            this.audio_time_arr = audio_time_arr;
        }

        public boolean isHad_viewed() {
            return had_viewed;
        }

        public void setHad_viewed(boolean had_viewed) {
            this.had_viewed = had_viewed;
        }

        public String getColumn_bgcolor() {
            return column_bgcolor;
        }

        public void setColumn_bgcolor(String column_bgcolor) {
            this.column_bgcolor = column_bgcolor;
        }

        public String getVideo_time() {
            return video_time;
        }

        public void setVideo_time(String video_time) {
            this.video_time = video_time;
        }

        public String getColumn_cover() {
            return column_cover;
        }

        public void setColumn_cover(String column_cover) {
            this.column_cover = column_cover;
        }

        public String getAudio_md5() {
            return audio_md5;
        }

        public void setAudio_md5(String audio_md5) {
            this.audio_md5 = audio_md5;
        }

        public String getArticle_poster_wxlite() {
            return article_poster_wxlite;
        }

        public void setArticle_poster_wxlite(String article_poster_wxlite) {
            this.article_poster_wxlite = article_poster_wxlite;
        }

        public boolean isArticle_cover_hidden() {
            return article_cover_hidden;
        }

        public void setArticle_cover_hidden(boolean article_cover_hidden) {
            this.article_cover_hidden = article_cover_hidden;
        }

        public int getCid() {
            return cid;
        }

        public void setCid(int cid) {
            this.cid = cid;
        }

        public boolean isArticle_could_preview() {
            return article_could_preview;
        }

        public void setArticle_could_preview(boolean article_could_preview) {
            this.article_could_preview = article_could_preview;
        }

        public String getArticle_summary() {
            return article_summary;
        }

        public void setArticle_summary(String article_summary) {
            this.article_summary = article_summary;
        }

        public int getVideo_width() {
            return video_width;
        }

        public void setVideo_width(int video_width) {
            this.video_width = video_width;
        }

        public String getAudio_dubber() {
            return audio_dubber;
        }

        public void setAudio_dubber(String audio_dubber) {
            this.audio_dubber = audio_dubber;
        }

        public int getColumn_id() {
            return column_id;
        }

        public void setColumn_id(int column_id) {
            this.column_id = column_id;
        }

        public static class AudioTimeArrBean {
            /**
             * m : 13
             * s : 22
             * h : 00
             */

            private String m;
            private String s;
            private String h;

            public String getM() {
                return m;
            }

            public void setM(String m) {
                this.m = m;
            }

            public String getS() {
                return s;
            }

            public void setS(String s) {
                this.s = s;
            }

            public String getH() {
                return h;
            }

            public void setH(String h) {
                this.h = h;
            }
        }
    }
}
