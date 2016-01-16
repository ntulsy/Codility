using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using CountDistinctSlices;

namespace Codility.Test
{
    [TestClass]
    public class CountDistinctSlicesTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int[] A = { 3, 4, 5, 5, 2 };
            int result = s.solution(6, A);
            Assert.AreEqual(9, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int[] A = { 1 };
            int result = s.solution(10, A);
            Assert.AreEqual(1, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            int[] A = { 1, 1, 1, 1 };
            int result = s.solution(4, A);
            Assert.AreEqual(4, result);
        }

        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            int[] A = { 1, 2, 3, 1, 5 };
            int result = s.solution(10, A);
            Assert.AreEqual(13, result);
        }

        [TestMethod]
        public void TestMethod5()
        {
            Solution s = new Solution();
            int[] A = Enumerable.Range(1, 100000).ToArray();
            int result = s.solution(100000, A);
            Assert.AreEqual((int) 1e9, result);
        }
    }
}
