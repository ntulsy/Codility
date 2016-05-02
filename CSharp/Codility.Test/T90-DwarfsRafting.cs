using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using DwarfsRafting;

namespace Codility.Test
{
    [TestClass]
    public class DwarfsRaftingTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int N = 4;
            string S = "1B 1C 4B 1D 2A";
            string T = "3B 2D";
            int result = s.solution(N, S, T);
            Assert.AreEqual(6, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int N = 2;
            string S = "";
            string T = "";
            int result = s.solution(N, S, T);
            Assert.AreEqual(4, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            int N = 4;
            string S = "1A 1B 2A 2B";
            string T = "";
            int result = s.solution(N, S, T);
            Assert.AreEqual(8, result);
        }

        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            int N = 4;
            string S = "1A 1B 2A 2B";
            string T = "3C";
            int result = s.solution(N, S, T);
            Assert.AreEqual(-1, result);
        }

        [TestMethod]
        public void TestMethod5()
        {
            Solution s = new Solution();
            int N = 4;
            string S = "";
            string T = "1A 1B 2A 2B";
            int result = s.solution(N, S, T);
            Assert.AreEqual(12, result);
        }

        [TestMethod]
        public void TestMethod6()
        {
            Solution s = new Solution();
            int N = 4;
            string S = "1A 1B 2A 2B";
            string T = "3A";
            int result = s.solution(N, S, T);
            Assert.AreEqual(7, result);
        }
    }
}
