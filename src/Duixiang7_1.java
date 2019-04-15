//电脑玩家
public class Duixiang7_1 {
        /** 静态常量：出拳类型的信息 */
        public static final int MessageTypeFist = 1;
        /** 静态常量：出赢得比赛的信息 */
        public static final int MessageTypeWin = 2;
        /** 静态常量：输掉比赛的信息 */
        public static final int MessageTypeLose = 3;
        //属性：名称、分数、所出的拳、(爵士对应的音效)、角色的个性化台词
        private String name;
        private int score;
        private int fist;
        //。。。。。。
        /** 角色在出拳的时候，所说的个性化台词 */
        private String[] fistWords ={
                "动感光波~biubiubiu~~~",
                "大象大象你的鼻子为什么这么长~~",
                "必杀：露PP外星人",
                "大姐姐你喜欢吃青椒吗？",
                "胸部扁扁的欧巴桑，吃我一拳~"
        };
        private String [] winWords={
                "还有谁",
                "猜拳，有点意思",
                "~~~~超~~~神~~~~~",
                "全军出击~~~！！！1",
                "吃着火锅唱着歌，然后你就输了~"
        };
        private String []loseWords ={
                "通往成功的路总是施工~~",
                "等到潮水褪去，就知道谁在裸泳了。。。",
                "夏天就是不好，穷的时候联系北风都没得喝",
                "将来我死了，把QQ捐给希望工程，让孩子们一上来就能用带着太阳的QQ。。。",
                "众人皆醉我独醒，举杯皆浊我独清。。。"
        };

        /**
         * g根据传入的消息类型，随机打印对应类型的消息
         * @param msgType 对应Duixiang7类中定义的静态常量
         */
        public  void sendMessage(int msgType){
            //生成一个0-4之间的随机数字
            int index =((int)(Math.random()*1000)) % 5;
            String message =null;
            switch (msgType){
                case MessageTypeFist:
                    message =fistWords[index];
                    break;
                case MessageTypeWin:
                    message =winWords[index];
                    break;
                case MessageTypeLose:
                    message =loseWords[index];
                    break;
            }
            System.out.println(message);
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public int getFist() {
            //电脑的出拳实际上就是生成了1-3之间的随机数字
            fist =((int)(Math.random() *30000))%3+1;
            return fist;
        }
//
//        public void setFist(int fist) {
//            this.fist = fist;
//        }
//方法：设置和得到名称、分数、(播放音效)、说个性化台词、出拳
    }