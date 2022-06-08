
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.*;
import java.util.Scanner;

public class Homework {
    static Scanner scanner = new Scanner(System.in);

    public void mainMenu() throws Exception {
        System.out.println("欢迎进入学汉语用汉字，弘扬汉语言文化");
        System.out.println("首先请大家登录或注册");
        System.out.println("1.登录，2.注册");
        System.out.println("请选择您需要进行的操作：");
        int nextInt = scanner.nextInt();
        if (nextInt == 1) {
            new Homework().login(nextInt);
        } else if (nextInt == 2) {
            new Homework().reg(nextInt);
        }
    }

    public void login(int nextInt) throws Exception {
        if (nextInt == 1) {
            System.out.println("欢迎进入登录模块！");
            System.out.println("请输入账号：");
            String name = scanner.next();
            System.out.println("请输入密码：");
            String pass = scanner.next();
            System.out.println("正在检验···");
            FileReader fr = new FileReader("user.txt");
            BufferedReader bf = new BufferedReader(fr);
            String str;
            // 按行读取字符串
            int temp = 0;
            while ((str = bf.readLine()) != null) {
                if (temp == 0) {
                    if (str.equals(name)) {
                        temp++;
                    }
                } else if (temp == 1) {
                    if (str.equals(pass)) {
                        temp++;
                    }
                }
            }
            if (temp == 2) {
                new Homework().homePage();
            } else {
                System.out.println("验证失败～");
                new Homework().mainMenu();
            }
            bf.close();
            fr.close();
        }
    }

    public void reg(int nextInt) throws Exception {
        if (nextInt == 2) {
            System.out.println("欢迎进入注册模块！");
            System.out.println("请输入账号：");
            String name = scanner.next();
            System.out.println("请输入密码：");
            String pass = scanner.next();
            File file = new File("user.txt");
            FileWriter fileWritter = new FileWriter(file.getName(), true);
            fileWritter.write(name);
            fileWritter.write("\n");
            fileWritter.write(pass);
            fileWritter.close();
            System.out.println("注册成功！");
            new Homework().mainMenu();
        }
    }

    public void homePage() throws Exception {
        System.out.println("-----------");
        System.out.println("欢迎进入首页～");
        System.out.println("欢迎进入主要模块～");
        System.out.println("请选择模块：1.成语题 2.问答题 3.播放音乐 4.小故事  5.退出");
        int nextInt = scanner.nextInt();
        if (nextInt == 1) {
            new Homework().idiomQuestion();
        } else if (nextInt == 2) {
            new Homework().ancientPoetry();
        } else if (nextInt == 3) {
            new Homework().sound();
        }else if (nextInt == 4) {
            new Homework().story();
        }
        else if (nextInt == 5) {
            System.out.println("谢谢使用本程序！");
            System.exit(0);
        }

    }

    private void story() throws Exception {
        System.out.println("欢迎进入小故事模块～");
        System.out.println("-------------");
        System.out.println("第1个小故事：\n");
        System.out.println("铁杵磨针\n");
        System.out.println("唐朝著名大诗人李白小时候不喜欢念书，常常逃学，到街上去闲逛。\n" +
                "　　一天，李白又没有去上学，在街上东溜溜、西看看，不知不觉到了城外。暖和的阳光、欢快的小鸟、随风摇摆的花草使李白感叹不已，“这么好的天气，如果整天在屋里读书多没意思？”\n" +
                "　　走着走着，在一个破茅屋门口，坐着一个满头白发的老婆婆，正在磨一根棍子般粗的铁杵。李白走过去，“老婆婆，您在做什么？”\n" +
                "“我要把这根铁杵磨成一个绣花针。 ”老婆婆抬起头，对李白笑了笑，接着又低下头继续磨着。\n" +
                "　　“绣花针？”李白又问：“是缝衣服用的绣花针吗？”\n" +
                "　　“当然！”\n" +
                "　　“可是，铁杵这么粗，什么时候能磨成细细的绣花针呢？”\n" +
                "　　老婆婆反问李白：“滴水可以穿石，愚公可以移山，铁杵为什么不能磨成绣花针呢？”\n" +
                "　　“可是，您的年纪这么大了？”\n" +
                "　　“只要我下的功夫比别人深，没有做不到的事情。”\n" +
                "　　老婆婆的一番话，令李白很惭愧，于是回去之后，再没有逃过学。每天的学习也特别用功，终于成了名垂千古的诗仙。");
        System.out.println("------------");
        System.out.println("第2个小故事：\n");
        System.out.println("闻鸡起舞\n");
        System.out.println("晋代的祖逖是个胸怀坦荡、具有远大抱负的人。可他小时候却是个不爱读书的淘气孩子。进入青年时代，他意识到自己知识的贫乏，深感不读书无以报效国家，于是就发奋读起书来。他广泛阅读书籍，认真学习历史，于是就发奋读起书来。他广泛阅读书籍，认真学习历史，从中汲取了丰富的知识，学问大有长进。他曾几次进出京都洛阳，接触过他的人都说，祖逖是个能辅佐帝王治理国家的人才。祖逖24岁的时候，曾有人推荐他去做官司，他没有答应，仍然不懈地努力读书。 \n" +
                "　后来，祖逖和幼时的好友刘琨一志担任司州主簿。他与刘琨感情深厚，不仅常常同床而卧，同被而眠，而且还有着共同的远大理想：建功立业，复兴晋国，成为国家的栋梁之才。\n" +
                "　　一次，半夜里祖逖在睡梦中听到公鸡的鸣叫声，他一脚把刘琨踢醒，对他说：“别人都认为半夜听见鸡叫不吉利，我偏不这样想，咱们干脆以后听见鸡叫就起床练剑如何？”刘琨欣然同意。于是他们每天鸡叫后就起床练剑，剑光飞舞，剑声铿锵。春去冬来，寒来暑往，从不间断。功夫不负有心人，经过长期的刻苦学习和训练，他们终于成为能文能武的全才，既能写得一手好文章，又能带兵打胜仗。祖逖被封为镇西将军，实现了他报效国家的愿望；刘琨做了都督，兼管并、冀、幽三州的军事，也充分发挥了他的文才武略。");
        System.out.println("------------");
        System.out.println("第3个小故事：\n");
        System.out.println("亡羊补牢\n");
        System.out.println("这故事出自“战国策”。战国时代，楚国有一个大臣，名叫庄辛，有一天对楚襄王说： “你在宫里面的时候，左边是州侯，右边是夏侯；出去的时候，鄢陵君和寿跟君又总是随看你。你和这四个人专门讲究奢侈淫乐，不管国家大事，郢（楚都，在今湖北省江陵县北）一定要危险啦！”\n" +
                "　　襄王听了，很不高兴，生气骂道：“你老糊涂了吗？故意说这些险恶的话惑乱人心吗？”\n" +
                "　　庄辛不慌不忙的回答说：“我实在感觉事情一定要到这个地步的，不敢故意说楚国有什么不幸。 \n" +
                "如果你一直宠信这个人，楚国一定要灭亡的。你既然不信我的话，请允许我到赵国躲一躲，看事情究竟会怎样。” 庄辛到赵国才住了五个月，秦国果然派兵侵楚，襄王被迫流亡到阳城（今河南息县西 北）。这才觉得庄辛的话不错，赶紧派人把庄辛找回来，问他有什么办法；庄辛很诚恳地说：“我听说过，看见兔子牙想起猎犬，这还不晚；羊跑掉了才补羊圈，也还不迟。……”");
        System.out.println("------------");
        new Homework().homePage();
    }

    public void sound() throws Exception {
        FileInputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;
        //声明一个File对象
        File mp3 = new File("All-My-Life.mp3");
        //创建一个输入流
        inputStream = new FileInputStream(mp3);
        //创建一个缓冲流
        bufferedInputStream = new BufferedInputStream(inputStream);
        //创建播放器对象，把文件的缓冲流传入进去
        final Player player = new Player(bufferedInputStream);
        new Thread(() -> {
            try {
                player.play();
            } catch (JavaLayerException e) {
                e.printStackTrace();
            }
        }).start();
        new Homework().homePage();
    }

    public void idiomQuestion() throws Exception {
        System.out.println("欢迎进入成语模块～");
        System.out.println("第1题：下列句子中，加点的成语使用正确的一项是（ ）");
        System.out.println("A．刚学做菜的王艳老是忘记放盐和其他调料，吃起来让我们觉得味同嚼蜡。\n" +
                "\n" +
                "B．晚自习课上，老师又教了我们一种思路，重蹈覆辙地将这道题做了一遍。\n" +
                "\n" +
                "C．我们要把叶子切下来拿到显微镜下去观察，袖手旁观是不能得到知识的。\n" +
                "\n" +
                "D．李琪经常为孤寡老人做好事，他的事迹真是罄竹难书。");
        System.out.println("请输入你的答案：");
        String next = scanner.next();
        if (next.equals("C")) {
            System.out.println("回答正确");
        } else {
            System.out.println("正确答案是：C");
            System.out.println("错误解析：" +
                    "味同嚼蜡：象吃蜡一样，没有一点儿味。形容语言或文章枯燥无味。重蹈覆辙：重新走上翻过车的老路。比\n" +
                    "\n" +
                    "喻不吸取教训，再走失败的老路。袖手旁观：把手笼在袖子里，在一旁观看。比喻置身事外，既不过问，也不协助别\n" +
                    "\n" +
                    "人。罄竹难书：用尽竹子也难写完。形容罪行多得写不完。");
        }
        System.out.println("---------------");
        System.out.println("第2题：下列各句中，画线成语使用恰当的一项是（ ）");
        System.out.println("A、“人间四月天，麻城看杜鹃”，2010年4月25日至5月10日麻城市成功举办了第二届“麻城杜鹃旅游文化节”的\n" +
                "\n" +
                "活动，使“杜鹃花城”的名声响彻云霄。\n" +
                "\n" +
                "B、马的颚骨虽然很长，它却没有如驴的那副蠢相，如牛的那副呆相。相反地，它的头部比例整齐，却给它一种轻捷的\n" +
                "\n" +
                "神情，而这种神情又恰好与颈部的美各得其所。\n" +
                "\n" +
                "C、创新是时代的要求，我们在学习和生活中，一旦产生小的灵感，就要相信它的价值，并锲而不舍地把它发展下去。\n" +
                "\n" +
                "如果能做到这些，你一定会成为一个富有创造性的人。\n" +
                "\n" +
                "D、玉树地震灾情发生后，街头的流动采血车前，等待献血的群众排起了长队，这场面让人感动得头晕目眩。");
        System.out.println("请输入你的答案：");
        next = scanner.next();
        if (next.equals("C")) {
            System.out.println("回答正确");
        } else {
            System.out.println("正确答案是：C");
            System.out.println("错误解析：" +
                    "响彻云霄：形容声音响亮，好象可以穿过云层，直达高空。各得其所：原指各人都得到满足。后指每个人\n" +
                    "\n" +
                    "或事物都得到恰当的位置或安排。锲而不舍：不断地镂刻。比喻有恒心，有毅力。头晕目眩：头发昏，眼发花。");
        }
        System.out.println("---------------");
        System.out.println("第3题：下面是小华写给学弟学妹们的一段话，填入横线处的词语，最符合语境的一项是 ( )");
        System.out.println("生活就是99 个回合，① 生活就是不断面对新的挑战。当你一帆风顺、②_的时候，切勿得意，切勿大意。几个回合的胜利并不可靠。生活还有90 多场考验,当你③__、悲观丧气的时候，切勿_④，几个回合的碰壁又算得了什么，后边还有90 多个机会。\n" +
                "\n" +
                "A. ① 因为 ②势如破竹 ③一蹶不振 ④自暴自弃\n" +
                "\n" +
                "B. ① 也许 ②顺风顺水 ③心灰意冷 ④自吹自擂\n" +
                "\n" +
                "C. ① 也许 ②势如破竹 ③一蹶不振 ④自暴自弃\n" +
                "\n" +
                "D. ① 因为 ②势如破竹 ③难以忍受 ④自吹自擂");
        System.out.println("请输入你的答案：");
        next = scanner.next();
        if (next.equals("A")) {
            System.out.println("回答正确");
        } else {
            System.out.println("正确答案是：A");
            System.out.println("【分析】第一空：“ 因为” 表示因果关系。“ 也许” 表示估计。分析语义可知，“ 生活就是不断面对新的挑战” 是前一句“ 生活就是99 个回合” 的原因，所以此处应用“ 因为” 。" +
                    "第二空：“ 顺风顺水” 与前面的“ 一帆风顺” 语义上有重复，所以此处应用“ 势如破竹” 。" +
                    "第三空：一蹶不振：比喻遭受一次挫折以后就再也振作不起来。心灰意冷：灰心失望，意志消沉。难以忍受：不能再忍受。只有“ 一蹶不振” 与前文的“ 一帆风顺” 在语义上构成了对比，所以此处应用“ 一蹶不振” 。" +
                    "第四空：自暴自弃：自己瞧不起自己，甘于落后或堕落。自吹自擂：比喻自我吹嘘。根据语境，此处应用“ 自暴自弃” 。");
        }
        System.out.println("---------------");
        System.out.println("第4题：在下列句子的空缺处依次填入成语，最恰当的一组是");
        System.out.println("①毒奶粉、地沟油、假羊肉等一系列 的事件接连发生，人们不得不反思：为什么我们的道德竟然沦落到了这样的地步?\n" +
                "　　②在离地球三百公里的太空课堂上，航天员王亚平一边做实验，一边 ，为6000万中小学生上了一堂别开生面的科普课。\n" +
                "　　③中国不差钱，只要能激活民间资本让银行资本难以 的灵活运作方式与潜能，“钱荒”问题就迎刃而解了。\n" +
                "A.耸人听闻 娓娓而谈 望尘莫及\n" +
                "　　B.骇人听闻 娓娓而谈 望其项背\n" +
                "　　C.耸人听闻 振振有词 望尘莫及\n" +
                "　　D.骇人听闻 振振有词 望其项背");
        System.out.println("请输入你的答案：");
        next = scanner.next();
        if (next.equals("B")) {
            System.out.println("回答正确");
        } else {
            System.out.println("正确答案是：B");
            System.out.println("试题分析：成语的正确使用中，我们首先当然要明白词语意思，其次我们必须注意词语的适用范围，" +
                    "①耸人听闻：故意说夸大或惊奇的话，使人震惊;骇人听闻：使人听了非常吃惊，多指社会上发生的坏事;结合语境中各种社会问题，应使用“骇人听闻”。" +
                    "②娓娓而谈：连续不倦地、生动地谈论，褒义;振振有词：形容理由似乎很充分，说个不休，贬义;根据感情色彩判断，选“娓娓而谈”。" +
                    "③望其项背：表示赶得上或比得上，多用于否定式;望尘莫及：比喻远远落后，赶不上;从搭配判断，应该选“望其项背”");
        }
        System.out.println("---------------");
        System.out.println("第5题：在下面一段话空缺处依次填入成语，最恰当的一组是()");
        System.out.println("笔名满天下而原名湮没无闻者，事实上等于       。人家给咱们介绍一位沈雁冰先生，不如介绍茅盾来得响亮;介绍一位谢婉莹女士，不如介绍冰心来得      。" +
                "等到自己也肯公然承认名叫茅盾或冰心的时候，仍不失为行不更名、坐不改姓的好汉。千秋万岁后，非但真假难辨，而且      。\n" +
                "　A.改名换姓/大名鼎鼎/弄巧成拙\n" +
                "　　B.移花接木/如雷贯耳/弄巧成拙\n" +
                "　　C.改名换姓/如雷贯耳/弄假成真\n" +
                "　　D.移花接木/大名鼎鼎/弄假成真");
        System.out.println("请输入你的答案：");
        next = scanner.next();
        if (next.equals("C")) {
            System.out.println("回答正确");
        } else {
            System.out.println("正确答案是：C");
            System.out.println("【解析】第一空根据“笔名满天下而原名湮没无闻”应填“改名换姓”，“移花接木”含有“暗中更换人和物，以假乱真”之意，与前文语境不符;" +
                    "第二空根据沈雁冰之例中有“来得响亮”一语，所以选填“如雷贯耳”最为恰当;" +
                    "第三空由“真假难辨”和上文讲到的趋势，填“弄假成真”。");
        }
        new Homework().homePage();
    }

    public void ancientPoetry() throws Exception {
        System.out.println("欢迎进入古诗模块～");
        System.out.println("第1题：“独在异乡为异客，每逢佳节倍思亲。”是_____的诗句");
        System.out.println("A 、 王维\n" +
                "B、王之涣\n" +
                "C 、王勃");
        System.out.println("请输入你的答案：");
        String next = scanner.next();
        if (next.equals("A")) {
            System.out.println("回答正确");
        } else {
            System.out.println("正确答案是：A");
        }
        System.out.println("---------------");
        System.out.println("第2题：《天净沙 ●秋思》的作者是元代_____的");
        System.out.println("A、张养浩\n" +
                "B、马致远\n" +
                "C、元好问");
        System.out.println("请输入你的答案：");
        next = scanner.next();
        if (next.equals("B")) {
            System.out.println("回答正确");
        } else {
            System.out.println("正确答案是：B");
        }
        System.out.println("---------------");
        System.out.println("第3题：《七步诗》的作者是_____");
        System.out.println("A、 曹操\n" +
                "B、曹丕\n" +
                "C、曹植");
        System.out.println("请输入你的答案：");
        next = scanner.next();
        if (next.equals("C")) {
            System.out.println("回答正确");
        } else {
            System.out.println("正确答案是：C");
        }
        System.out.println("---------------");
        System.out.println("第4题：杜甫的《春夜喜雨》中的“晓看红湿处”的下句是_____");
        System.out.println("A 、花重绵阳城\n" +
                "B、花重锦州城\n" +
                "C、花重锦官城");
        System.out.println("请输入你的答案：");
        next = scanner.next();
        if (next.equals("C")) {
            System.out.println("回答正确");
        } else {
            System.out.println("正确答案是：C");
        }
        System.out.println("---------------");
        System.out.println("第5题：“春色满园关不住，一枝红杏出墙来。”出自叶绍翁的_____");
        System.out.println("A 、《游园不植》\n" +
                "B、 《春望》\n" +
                "C、《春夜喜雨》");
        System.out.println("请输入你的答案：");
        next = scanner.next();
        if (next.equals("A")) {
            System.out.println("回答正确");
        } else {
            System.out.println("正确答案是：A");
        }
        new Homework().homePage();
    }

    public static void main(String[] args) throws Exception {
        new Homework().mainMenu();
    }
}
