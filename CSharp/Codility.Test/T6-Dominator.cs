using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Dominator;

namespace Codility.Test
{
    [TestClass]
    public class DominatorTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int[] H = new int[] { 8, 8, 5, 7, 8, 8, 7, 4, 8 };
            int result = s.solution(H);
            Assert.AreEqual(0, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int[] H = new int[] { 1 };
            int result = s.solution(H);
            Assert.AreEqual(0, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            int[] H = new int[] { 1, 1, 1, 1, 1, 1 };
            int result = s.solution(H);
            Assert.AreEqual(0, result);
        }

        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            int[] H = new int[] { 1, 1, 1, 1, 1, 5, 6, 4, 2 };
            int result = s.solution(H);
            Assert.AreEqual(0, result);
        }

        [TestMethod]
        public void TestMethod5()
        {
            Solution s = new Solution();
            int[] H = new int[] { 5, 4, 3, 2, 1, 5, 5, 5, 5 };
            int result = s.solution(H);
            Assert.AreEqual(0, result);
        }

        [TestMethod]
        public void TestMethod6()
        {
            Solution s = new Solution();
            int[] H = new int[] { 3, 4, 3, 2, 3, 1, 3, 0 };
            int result = s.solution(H);
            Assert.AreEqual(-1, result);
        }

        [TestMethod]
        public void TestMethod7()
        {
            Solution s = new Solution();
            int[] H = new int[] { -1, 4, -1, 2, -1, 1, -1, 3 };
            int result = s.solution(H);
            Assert.AreEqual(-1, result);
        }

        [TestMethod]
        public void TestMethod8()
        {
            Solution s = new Solution();
            int[] H = new int[] { -1, 4, -1, 2, -1, 1, -1, -1 };
            int result = s.solution(H);
            Assert.AreEqual(0, result);
        }
    }
}
