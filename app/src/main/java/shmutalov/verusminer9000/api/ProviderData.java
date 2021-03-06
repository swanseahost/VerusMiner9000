// Copyright (c) 2020, Scala
//
// Please see the included LICENSE file for more information.

package shmutalov.verusminer9000.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class ProviderData {
    public static class Network {
        public String lastBlockHeight = "";
        public String difficulty = "";
        public String lastRewardAmount = "";
        public String lastBlockTime = "";
        public String hashrate = "";
    }

    public static class Pool {
        public String lastBlockHeight = "";
        public String difficulty = "";
        public String lastRewardAmount = "";
        public String lastBlockTime = "";
        public String hashrate = "";
        public String blocks = "";
        public String minPayout = "";
        int type = -1;
    }

    public static class Miner {
        public String hashrate = "";
        public String balance = "";
        public String paid = "";
        public String lastShare = "";
        public String blocks = "";
        public List<Payment> payments = new ArrayList<>();
    }

    public static class Coin {
        public String name = "Scala";
        public String symbol = "XLA";
        public long units;
        public long denominationUnit = 100L;
    }

    public static class Payment {
        public float amount;
        public Date timestamp;
    }

    final public Network network = new Network();
    final public Pool pool = new Pool();
    final public Coin coin = new Coin();
    final public Miner miner = new Miner();

    public boolean isNew = true;
}
